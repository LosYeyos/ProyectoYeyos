package com.moviles.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class PeticionIntercambio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @OneToOne
    private Usuario solicitante;

    @NonNull
    @OneToOne
    private PostIntercambio postIntercambio;

    @NonNull
    @OneToOne
    private PostIntercambio postIntercambioSolicitante;

    private boolean aceptada;


}
