package br.com.triersistemas.venda.model;


import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Farmaceuticomodel {

    private String nome;
    private LocalDate aniver;
    private String cpf;
    private int ID;
    private int idade;
}
