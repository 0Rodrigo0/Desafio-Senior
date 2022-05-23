package com.desafioSenior.javaerpchallenger.service;

import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import com.desafioSenior.javaerpchallenger.repository.ProdutoServicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoServicoService {
    private final ProdutoServicoRepository repository;

    public ProdutoServicoService(ProdutoServicoRepository repository) {
        this.repository = repository;
    }
    public ProdutoServico addProdutoServico (ProdutoServico produtoServico){
        return repository.save(produtoServico);
    }
    public List<ProdutoServico> listaItens() {
        return repository.findAll();
    }
    public ProdutoServico addItem(ProdutoServico produtoServico) {
        return repository.save(produtoServico);
    }
    public ProdutoServico updateItem(UUID id, ProdutoServico produtoServico) {
        ProdutoServico alteraItem = repository.findById(id).get();
        alteraItem.setNome(produtoServico.getNome());
        alteraItem.setTipo(produtoServico.getTipo());
        alteraItem.setValor(produtoServico.getValor());
        return repository.save(alteraItem);
    }
    public void deletaItem(UUID id) {
        repository.deleteById(id);
    }
}
