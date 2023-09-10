package com.example.ecommerce.service.put;

import com.example.ecommerce.dto.produto.ProdutoPutDTO;
import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProdutoServicePut {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto update(Long id, ProdutoPutDTO produtoPutDTO) {
        Optional<Produto> p1 = produtoRepository.findById(id);
        Produto produtoUpdated = p1.get();

        produtoUpdated.setNome(produtoPutDTO.getNome());
        produtoUpdated.setCodigoDeBarras(produtoPutDTO.getCodigoDeBarras());
        produtoUpdated.setPreco(produtoPutDTO.getPreco());

        return produtoRepository.save(produtoUpdated);
    }
}
