package com.desafioSenior.javaerpchallenger.DTO;

import com.desafioSenior.javaerpchallenger.model.ProdutoServico;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class NovoProdutoServicoDto {

    @NotBlank
    private String nome;
    @NotBlank
    private Double valor;
    @NotBlank
    private Integer tipo;

    public ProdutoServico converte(){
        ProdutoServico produtoServico = new ProdutoServico();
        produtoServico.setNome(nome);
        produtoServico.setValor(valor);
        produtoServico.setTipo(tipo);
        return produtoServico;
    }
}
