package com.moviles.model.dtos;

import java.time.LocalDate;

import com.moviles.model.entities.enums.EstadoAnuncio;
import com.moviles.model.entities.enums.EstadoMovil;
import com.moviles.model.entities.enums.TipoCambio;

public record AnuncioDTO(Long id, MovilDTO movil, EstadoMovil estadoMovil, TipoCambio tipoCambio, LocalDate fechaPublicacion, EstadoAnuncio estadoAnuncio) {

}
