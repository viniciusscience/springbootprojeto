package br.com.triersistemas.venda.model;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Fornecedormodel {

    private String nome;
    private LocalDate aniver;
    private String cnpj;
    private int ID;
    private int idade;
}
