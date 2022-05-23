package com.desafioSenior.javaerpchallenger.controller;

import com.desafioSenior.javaerpchallenger.DTO.NovoPedidoDto;
import com.desafioSenior.javaerpchallenger.model.Pedido;
import com.desafioSenior.javaerpchallenger.service.PedidoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }
    //localhost:8080/pedido
    @GetMapping
    public List<Pedido> listaPedido(){
        return service.listaPedido();
    }
    //localhost:8080/pedido/cadastra
    @PostMapping("/cadastra")
    public Pedido addPedido(@RequestBody NovoPedidoDto pedidoDto){
        if (pedidoDto.getProdutoServico().getTipo().equals(1)){
            pedidoDto.setValor(pedidoDto.getProdutoServico().getValor());
            pedidoDto.setTotal(pedidoDto.getProdutoServico().getValor()- pedidoDto.getDesconto());
        }else{
            pedidoDto.setValor(pedidoDto.getProdutoServico().getValor());
            pedidoDto.setTotal(pedidoDto.getProdutoServico().getValor());
        }
        return service.addPedido(pedidoDto.converte());
    }
    //localhost:8080/pedido/<colocar aqui o id>
    @PutMapping("/{id}")
    public Pedido updatePedido(@PathVariable UUID id, @RequestBody NovoPedidoDto pedidoDto){
        return service.updatePedido(id, pedidoDto.converte());
    }
    //localhost:8080/pedido/<colocar aqui o id>
    @DeleteMapping("/{id}")
    public void deletaPedido(@PathVariable UUID id){
        service.deletaPedido(id);
    }
}
