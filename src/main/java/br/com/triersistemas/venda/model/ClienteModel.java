package br.com.triersistemas.venda.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class ClienteModel {

    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate aniver;

}
