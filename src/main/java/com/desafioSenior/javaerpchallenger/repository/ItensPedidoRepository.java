package com.desafioSenior.javaerpchallenger.repository;

import com.desafioSenior.javaerpchallenger.model.ItensPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedido, UUID> {
}
