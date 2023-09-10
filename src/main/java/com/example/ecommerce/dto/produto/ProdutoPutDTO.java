package com.example.ecommerce.dto.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoPutDTO {
    @NotBlank
    @NotNull
    @JsonProperty("nome")
    private String nome;
    @NotBlank
    @NotNull
    @JsonProperty("preço")
    private Double preco;
    @NotBlank
    @NotNull
    @JsonProperty("codigo de barras")
    private int codigoDeBarras;
}
