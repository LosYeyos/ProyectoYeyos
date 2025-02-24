package com.moviles.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class PostVenta {
    @Id
    @NonNull
    @OneToOne
    private Anuncio id;

    @NonNull
    private double precio;
}
