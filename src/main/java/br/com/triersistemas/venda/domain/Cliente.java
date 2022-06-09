package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;

import java.util.UUID;

public class Cliente extends PessoaFisica{

    private UUID id;
    String nome;
    String cpf;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente() {
        this.id = UUID.randomUUID();
        this.nome = StringUtils.getRandomName();


    }
}
