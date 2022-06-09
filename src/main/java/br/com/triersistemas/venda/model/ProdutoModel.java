package br.com.triersistemas.venda.model;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;
@Getter
public class ProdutoModel {

    private String nome;
    private BigDecimal valor;
}