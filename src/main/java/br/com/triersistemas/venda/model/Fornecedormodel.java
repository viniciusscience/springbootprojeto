package br.com.triersistemas.venda.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Fornecedormodel {

    private String nome;
    private LocalDate aniver;
    private String cnpj;
    private int idade;
}
