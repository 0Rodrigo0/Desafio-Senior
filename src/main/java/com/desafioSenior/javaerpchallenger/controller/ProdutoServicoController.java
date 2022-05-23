package com.desafioSenior.javaerpchallenger.controller;

import com.desafioSenior.javaerpchallenger.DTO.NovoProdutoServicoDto;
import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import com.desafioSenior.javaerpchallenger.service.ProdutoServicoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtoServico")
public class ProdutoServicoController {
    private ProdutoServicoService service;

    public ProdutoServicoController(ProdutoServicoService service) {
        this.service = service;
    }
    //localhost:8080/produtoServico
    @GetMapping
    public List<ProdutoServico> listaItens(){
        return service.listaItens();
    }
    //localhost:8080/produtoServico/cadastra
    @PostMapping("/cadastra")
    public ProdutoServico addItem(@RequestBody NovoProdutoServicoDto produtoServicoDto){
        return service.addItem(produtoServicoDto.converte());
    }
    //localhost:8080/produtoServico/<colocar aqui o id>
    @PutMapping("/{id}")
    public ProdutoServico updateItem(@PathVariable UUID id, @RequestBody NovoProdutoServicoDto produtoServicoDto){
        return service.updateItem(id, produtoServicoDto.converte());
    }
    //localhost:8080/produtoServico/<colocar aqui o id>
    @DeleteMapping("/{id}")
    public void deletaItem(@PathVariable UUID id){

        service.deletaItem(id);
    }

}
