package br.com.triersistemas.venda.model;

import lombok.Getter;

import java.util.UUID;
@Getter
public class ProdutoModel {

    private UUID id;
    private String nome;
    private Double valor;

}
