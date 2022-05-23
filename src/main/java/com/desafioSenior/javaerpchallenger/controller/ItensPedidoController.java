package com.desafioSenior.javaerpchallenger.controller;
import com.desafioSenior.javaerpchallenger.DTO.NovoItensPedidoDto;
import com.desafioSenior.javaerpchallenger.DTO.NovoPedidoDto;
import com.desafioSenior.javaerpchallenger.model.ItensPedido;
import com.desafioSenior.javaerpchallenger.model.Pedido;
import com.desafioSenior.javaerpchallenger.service.ItensPedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/itensPedido")
public class ItensPedidoController {

    private ItensPedidoService service;

    public ItensPedidoController(ItensPedidoService service) {
        this.service = service;
    }

    //localhost:8080/itensPedido
    @GetMapping
    public List<ItensPedido> listaItensPedido(){
        return service.listaItensPedido();
    }

    //localhost:8080/itensPedido/cadastra
    @PostMapping("/cadastra")
    public ItensPedido addItensPedido(@RequestBody NovoItensPedidoDto itensPedidoDto){
        return service.addItensPedido(itensPedidoDto.converte());
    }
    //localhost:8080/itensPedido/<colocar aqui o id>
    @PutMapping("/{id}")
    public ItensPedido updateItensPedido(@PathVariable UUID id, @RequestBody NovoItensPedidoDto itensPedidoDto){
        return service.updateItensPedido(id, itensPedidoDto.converte());
    }

    //localhost:8080/itensPedido/<colocar aqui o id>
    @DeleteMapping("/{id}")
    public void deletaItensPedido(@PathVariable UUID id){
        service.deletaItensPedido(id);
    }
}
