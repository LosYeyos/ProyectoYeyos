package com.moviles.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class PostIntercambio {
    @Id
    @OneToOne
    private Anuncio anuncio;

    @NonNull
    private String estadoMinimo;
}
