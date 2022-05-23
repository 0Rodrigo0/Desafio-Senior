package com.desafioSenior.javaerpchallenger.DTO;

import com.desafioSenior.javaerpchallenger.model.ItensPedido;
import com.desafioSenior.javaerpchallenger.model.Pedido;
import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class NovoPedidoDto {
    @NotBlank
    private Double valor;
    @NotBlank
    private Double total;
    @NotBlank
    private Double desconto;
    @NotBlank
    private ProdutoServico produtoServico;

    public Pedido converte(){
        Pedido pedido = new Pedido();
        pedido.setValor(valor);
        pedido.setTotal(total);
        pedido.setDesconto(desconto);
        pedido.setProdutoServico(produtoServico);
        return pedido;
    }

}
