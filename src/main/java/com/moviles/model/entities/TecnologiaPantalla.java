package com.moviles.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class TecnologiaPantalla {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private int referencia;

    @NonNull
    private String tipo;

    @NonNull
    @OneToMany(mappedBy = "tecnologiaPantalla")
    private List<Movil> moviles;

}
