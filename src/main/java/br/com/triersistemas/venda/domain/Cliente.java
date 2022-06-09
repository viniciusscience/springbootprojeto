package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Cliente extends PessoaFisica {

    private String email;

    public Cliente(final String nome,
                   final LocalDate aniver,
                   final String cpf,
                   final String email) {
        super(nome, aniver, cpf);
        this.email = email;
    }

    public Cliente editar(final String nome, final LocalDate aniver, final String cpf, final String email) {
        super.editar(nome, aniver, cpf);
        this.email = email;
        return this;
    }
}