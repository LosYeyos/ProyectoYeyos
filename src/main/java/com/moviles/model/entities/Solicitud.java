package com.moviles.model.entities;

import com.moviles.model.entities.enums.EstadoSolicitud;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @OneToOne
    private Anuncio anuncio;

    @NonNull
    @OneToOne
    private Usuario usuarioSolicitante;

    @NonNull
    private String mensaje;

    @NonNull
    private EstadoSolicitud estado;

    @NonNull
    private LocalDate fechaSolicitud;
}
