package com.example.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(name = "preço", nullable = false)
    private Double preco;
    @Column(name = "codigo de barras")
    private int codigoDeBarras;
}
