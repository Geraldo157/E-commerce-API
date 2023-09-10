package com.example.ecommerce.service.delete;

import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceDELETE {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void delete(Long id){
        produtoRepository.deleteById(id);
    }
}
