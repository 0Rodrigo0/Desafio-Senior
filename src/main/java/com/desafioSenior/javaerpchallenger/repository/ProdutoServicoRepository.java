package com.desafioSenior.javaerpchallenger.repository;

import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, UUID> {
}
