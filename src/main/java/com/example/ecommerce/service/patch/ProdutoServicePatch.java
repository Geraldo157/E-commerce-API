package com.example.ecommerce.service.patch;

import com.example.ecommerce.dto.produto.ProdutoPatchDTO;
import com.example.ecommerce.dto.produto.ProdutoPutDTO;
import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServicePatch {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto update(Long id, ProdutoPatchDTO produtoPatchDTO) {
        Optional<Produto> p1 = produtoRepository.findById(id);
        Produto produtoUpdated = p1.get();

        produtoUpdated.setPreco(produtoPatchDTO.getPreco());

        return produtoRepository.save(produtoUpdated);
    }
}
