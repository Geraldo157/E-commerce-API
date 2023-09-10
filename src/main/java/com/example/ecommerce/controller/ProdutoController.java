package com.example.ecommerce.controller;

import com.example.ecommerce.dto.produto.ProdutoPatchDTO;
import com.example.ecommerce.dto.produto.ProdutoPostDTO;
import com.example.ecommerce.dto.produto.ProdutoPutDTO;
import com.example.ecommerce.service.delete.ProdutoServiceDELETE;
import com.example.ecommerce.service.get.ProdutoServiceFindAll;
import com.example.ecommerce.service.get.ProdutoServiceFindOne;
import com.example.ecommerce.service.patch.ProdutoServicePatch;
import com.example.ecommerce.service.post.ProdutoServicePost;
import com.example.ecommerce.service.put.ProdutoServicePut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "/produtos",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ProdutoController {

    @Autowired
    private ProdutoServiceFindOne produtoServiceFindOne;
    @Autowired
    private ProdutoServicePut produtoServicePut;
    @Autowired
    private ProdutoServiceFindAll produtoServiceFindAll;
    @Autowired
    private ProdutoServicePatch produtoServicePatch;
    @Autowired
    private ProdutoServicePost produtoServicePost;
    @Autowired
    private ProdutoServiceDELETE produtoServiceDELETE;

    @GetMapping("pegar-produto/{id}")
    public ResponseEntity<?> pegarProduto(
            @PathVariable Long id
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(produtoServiceFindOne.findOne(id));
    }

    @GetMapping("listar-produtos")
    public ResponseEntity<?> listarProdutos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(produtoServiceFindAll.findAll());
    }

    @PostMapping("criar-produto")
    public ResponseEntity<?> criarProduto(ProdutoPostDTO produtoPostDTO){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(produtoServicePost.save(produtoPostDTO));
    }

    @PutMapping("alterar-produto/{id}")
    public ResponseEntity<?> alterarProduto(
            @PathVariable Long id,
            ProdutoPutDTO produtoPutDTO
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(produtoServicePut.update(id, produtoPutDTO));
    }

    @PatchMapping("alterar-produto-simples")
    public ResponseEntity<?> alterarProdutoSimples(
            @PathVariable Long id,
            ProdutoPatchDTO produtoPatchDTO
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(produtoServicePatch.update(id, produtoPatchDTO));
    }

    @DeleteMapping("delete-produto")
    public ResponseEntity<?> deleteProduto(
            @PathVariable Long id
    ){
        produtoServiceDELETE.delete(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Produto Deletado.");
    }

}
