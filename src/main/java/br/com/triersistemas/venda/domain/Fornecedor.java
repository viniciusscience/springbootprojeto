package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica {

    private List<String> produtos;

    public Fornecedor() {
        this.produtos = StringUtils.getRandomListMedicine();
    }

    public Fornecedor(final String nome, final LocalDate aniver, final String cnpj) {
        super(nome, aniver, cnpj);
        this.produtos = StringUtils.getRandomListMedicine();
    }

    public List<String> getProdutos() {
        return produtos;
    }
}