package com.desafioSenior.javaerpchallenger.repository;

import com.desafioSenior.javaerpchallenger.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
}
