package com.desafioSenior.javaerpchallenger.DTO;

import com.desafioSenior.javaerpchallenger.model.ItensPedido;
import com.desafioSenior.javaerpchallenger.model.Pedido;
import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class NovoItensPedidoDto {
    @NotBlank
    private String nome;
    @NotBlank
    private Pedido pedido;
    @NotBlank
    private ProdutoServico produtoServico;

    public ItensPedido converte(){
        ItensPedido itensPedido = new ItensPedido();
        itensPedido.setNome(nome);
        itensPedido.setPedido(pedido);
        itensPedido.setProdutoServico(produtoServico);
        return itensPedido;
    }
}
