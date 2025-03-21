package com.moviles.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Procesador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private int referencia;

    @NonNull
    private String nombre;

    @NonNull
    private int numeroNucleos;

    @NonNull
    private double maxGHz;

    @JsonIgnore
    @NonNull
    @OneToMany(mappedBy = "procesador")
    private List<Movil> moviles;

}
