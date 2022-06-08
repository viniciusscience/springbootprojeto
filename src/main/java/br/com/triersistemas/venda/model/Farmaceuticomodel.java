package br.com.triersistemas.venda.model;


import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class Farmaceuticomodel {

    private String nome;
    private LocalDate aniver;
    private String cpf;
    private int idade;
}
