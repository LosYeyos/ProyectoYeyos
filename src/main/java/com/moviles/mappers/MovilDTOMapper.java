package com.moviles.mappers;

import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Movil;

public class MovilDTOMapper implements Mapper<MovilDTO, Movil> {

    private final ModeloDTOMapper modeloDTOMapper = new ModeloDTOMapper();
    private final ProcesadorDTOMapper procesadorDTOMapper = new ProcesadorDTOMapper();
    private final TecnologiaPantallaDTOMapper tecnologiaPantallaDTOMapper = new TecnologiaPantallaDTOMapper();

    @Override
    public Movil mapToEntity(MovilDTO dto) {
        Movil movil = new Movil();
        movil.setModelo(modeloDTOMapper.mapToEntity(dto.modelo()));
        movil.setProcesador(procesadorDTOMapper.mapToEntity(dto.procesador()));
        movil.setTecnologiaPantalla(tecnologiaPantallaDTOMapper.mapToEntity(dto.tecnologiaPantalla()));
        movil.setAlmacenamiento(dto.almacenamiento());
        movil.setTamanoPantalla(dto.tamanoPantalla());
        movil.setRAM(dto.RAM());
        movil.setDimensiones(dto.dimensiones());
        movil.setPeso(dto.peso());
        movil.setCapacidadPantalla(dto.capacidadPantalla());
        movil.setBateria(dto.bateria());
        movil.setNFC(dto.NFC());
        movil.setPrecio(dto.precio());
        movil.setFechaLanzamiento(dto.fechaLanzamiento());
        return movil;
    }

    @Override
    public MovilDTO mapToDTO(Movil target) {
        MovilDTO movilDTO = new MovilDTO(modeloDTOMapper.mapToDTO(target.getModelo()), procesadorDTOMapper.mapToDTO(target.getProcesador()), tecnologiaPantallaDTOMapper.mapToDTO(target.getTecnologiaPantalla()), target.getAlmacenamiento(), target.getTamanoPantalla(), target.getRAM(), target.getDimensiones(), target.getPeso(), target.getCapacidadPantalla(), target.getBateria(), target.hasNFC(), target.getPrecio(), target.getFechaLanzamiento());
        return movilDTO;
    }
}