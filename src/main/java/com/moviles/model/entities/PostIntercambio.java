package com.moviles.model.entities;

import com.moviles.model.entities.compositekeys.PostVentaId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class PostIntercambio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    @OneToOne
    private Anuncio anuncio;

    @NonNull
    private String estadoMinimo;
}
