package com.desafioSenior.javaerpchallenger.service;

import com.desafioSenior.javaerpchallenger.model.Pedido;
import com.desafioSenior.javaerpchallenger.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }
    public List<Pedido> listaPedido() {
        return repository.findAll();
    }
    public Pedido addPedido(Pedido pedido) {
        return repository.save(pedido);
    }
    public Pedido updatePedido(UUID id, Pedido pedido) {
        Pedido alteraPedido = repository.findById(id).get();
        alteraPedido.setValor(pedido.getValor());
        alteraPedido.setTotal(pedido.getTotal());
        alteraPedido.setDesconto(pedido.getDesconto());
        alteraPedido.setProdutoServico(pedido.getProdutoServico());
        return alteraPedido;
    }
    public void deletaPedido(UUID id) {
        repository.deleteById(id);
    }
}
