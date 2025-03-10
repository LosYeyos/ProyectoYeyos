package com.moviles.mappers;

import com.moviles.model.dtos.MovilDTO;
import com.moviles.model.entities.Movil;

public class MovilDTOMapper implements Mapper<MovilDTO, Movil> {

    private final ModeloDTOMapper modeloDTOMapper = new ModeloDTOMapper();
    private final ProcesadorDTOMapper procesadorDTOMapper = new ProcesadorDTOMapper();
    private final TecnologiaPantallaDTOMapper tecnologiaPantallaDTOMapper = new TecnologiaPantallaDTOMapper();

    @Override
    public Movil map(MovilDTO dto) {
        Movil movil = new Movil();
        movil.setModelo(modeloDTOMapper.map(dto.modelo()));
        movil.setProcesador(procesadorDTOMapper.map(dto.procesador()));
        movil.setTecnologiaPantalla(tecnologiaPantallaDTOMapper.map(dto.tecnologiaPantalla()));
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
}