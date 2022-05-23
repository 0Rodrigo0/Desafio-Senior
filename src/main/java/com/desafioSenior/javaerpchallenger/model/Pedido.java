package com.desafioSenior.javaerpchallenger.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "total")
    private Double total;
    @Column(name = "desconto")
    private Double desconto;

    @ManyToOne
    private ProdutoServico produtoServico;

}
