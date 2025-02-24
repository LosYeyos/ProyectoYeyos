package com.moviles.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Movil {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @ManyToOne
    private Modelo modelo;

    @NonNull
    @ManyToOne
    private Procesador procesador;

    @NonNull
    @ManyToOne
    private TecnologiaPantalla tecnologiaPantalla;

    @NonNull
    private int almacenamiento;

    @NonNull
    private double tamanoPantalla;

    @NonNull
    private int RAM;

    @NonNull
    private String dimensiones;

    @NonNull
    private int peso;

    @NonNull
    private int capacidadPantalla;

    @NonNull
    private int bateria;

    @NonNull
    private boolean NFC;

    @NonNull
    private double precio;

    @NonNull
    private LocalDate fechaLanzamiento;
}
