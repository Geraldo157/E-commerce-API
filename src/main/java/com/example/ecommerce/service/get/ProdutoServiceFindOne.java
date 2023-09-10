package com.example.ecommerce.service.get;

import com.example.ecommerce.model.Produto;
import com.example.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceFindOne {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto findOne(Long id){
        return produtoRepository.getReferenceById(id);
    }

}
