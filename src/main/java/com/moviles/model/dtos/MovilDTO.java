package com.moviles.model.dtos;

import java.time.LocalDate;

public record MovilDTO(Long id, ModeloDTO modelo, ProcesadorDTO procesador, TecnologiaPantallaDTO tecnologiaPantalla,
		int almacenamiento, double tamanoPantalla, int RAM, String dimensiones, int peso, int capacidadPantalla,
		int bateria, boolean NFC, double precio, LocalDate fechaLanzamiento) {
}
