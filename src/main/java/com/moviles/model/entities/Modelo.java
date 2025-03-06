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
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @ManyToOne
    private Marca marca;

    @NonNull
    private int referencia;

    @NonNull
    private String nombre;

    @JsonIgnore
    @OneToMany(mappedBy = "modelo")
    private List<Movil> moviles;
}
