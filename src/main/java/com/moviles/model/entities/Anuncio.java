package com.moviles.model.entities;

import com.moviles.model.entities.enums.EstadoAnuncio;
import com.moviles.model.entities.enums.EstadoMovil;
import com.moviles.model.entities.enums.TipoCambio;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @OneToOne //TODO: revisar esto, no se si es OneToOne o ManyToOne
    private Movil movil;

    @NonNull
    private EstadoMovil estadoMovil;

    @NonNull
    private TipoCambio tipoCambio;

    @NonNull
    private LocalDate fechaPublicacion;

    @NonNull
    private EstadoAnuncio estadoAnuncio;
}
