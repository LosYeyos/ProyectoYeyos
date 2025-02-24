package com.moviles.model.entities;

import com.moviles.model.entities.enums.UsuarioRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private String email;

    @NonNull
    private String nombre;

    @NonNull
    private String contraseña;

    @NonNull
    private UsuarioRole role;
}
