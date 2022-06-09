package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class Produto {

    private UUID id;
    private String nome;
    private BigDecimal valor;

    public Produto(final String nome, final BigDecimal valor) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.valor = valor;
    }

    public Produto editar(final String nome, final BigDecimal valor) {
        this.nome = nome;
        this.valor = valor;
        return this;
    }
}