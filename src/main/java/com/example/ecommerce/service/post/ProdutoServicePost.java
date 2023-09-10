package com.example.ecommerce.service.post;

import com.example.ecommerce.dto.produto.ProdutoPostDTO;
import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServicePost {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(ProdutoPostDTO produtoPostDTO){
        return produtoRepository.save(
                Produto.builder()
                        .codigoDeBarras(produtoPostDTO.getCodigoDeBarras())
                        .nome(produtoPostDTO.getNome())
                        .preco(produtoPostDTO.getPreco())
                        .build()
        );
    }
}
