package com.moviles.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class PeticionVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @OneToOne
    private Usuario usuarioSolicitante;

    @NonNull
    @OneToOne
    private PostVenta postVenta;

    @NonNull
    private boolean aceptada;
}
