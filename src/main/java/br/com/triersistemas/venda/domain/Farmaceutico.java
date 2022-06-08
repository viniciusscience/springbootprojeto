package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmaceutico extends PessoaFisica {

    private String promocaoDia;

    public Farmaceutico() {
        this.promocaoDia = StringUtils.getRandomMedicine();
    }


    public Farmaceutico(final String nome, final LocalDate aniver, final String cpf) {
        super(nome, aniver, cpf);
        this.promocaoDia = StringUtils.getRandomMedicine();
    }

    public String getPromocaoDia() {
        return promocaoDia;
    }
}

