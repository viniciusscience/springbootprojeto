package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;

import java.util.UUID;

public class Produto {
    private UUID id;
    String nome;
    Double valor;


    public Produto(final String nome,final UUID id,final double valor) {
        this.id = id;
        this.nome = nome;
        this.valor =valor;

    }
    public Produto(){
        this.id = UUID.randomUUID();
        this.nome = StringUtils.getRandomMedicine();
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }


    public void editar(String nome, Double valor, UUID id) {

    }
}
