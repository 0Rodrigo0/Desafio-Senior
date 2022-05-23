package com.desafioSenior.javaerpchallenger.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "itensPedido")
public class ItensPedido {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "nome")
    private String nome;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private ProdutoServico produtoServico;
}
