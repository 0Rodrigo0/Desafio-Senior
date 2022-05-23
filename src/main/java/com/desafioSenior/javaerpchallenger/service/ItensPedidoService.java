package com.desafioSenior.javaerpchallenger.service;

import com.desafioSenior.javaerpchallenger.model.ItensPedido;
import com.desafioSenior.javaerpchallenger.repository.ItensPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItensPedidoService {

    private final ItensPedidoRepository repository;

    public ItensPedidoService(ItensPedidoRepository repository) {
        this.repository = repository;
    }
    public List<ItensPedido> listaItensPedido() {
        return repository.findAll();
    }
    public ItensPedido addItensPedido(ItensPedido itensPedido) {
        return repository.save(itensPedido);
    }
    public ItensPedido updateItensPedido(UUID id, ItensPedido itensPedido) {
        ItensPedido alteraItensPedido = repository.findById(id).get();
        alteraItensPedido.setNome(itensPedido.getNome());
        alteraItensPedido.setPedido(itensPedido.getPedido());
        alteraItensPedido.setProdutoServico(itensPedido.getProdutoServico());
        return alteraItensPedido;
    }
    public void deletaItensPedido(UUID id) {
        repository.deleteById(id);
    }
}
