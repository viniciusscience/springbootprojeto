package br.com.triersistemas.venda.model;

import br.com.triersistemas.venda.domain.Cliente;
import br.com.triersistemas.venda.domain.Produto;
import br.com.triersistemas.venda.domain.Status;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
public class PedidoModel {
    private UUID id;
    private List<String> listaproduto;
    private String nome;
    private Double valor;
    private LocalDate dataPagamento;
    private double valorPago;
    private Status status;
    private String cliente;

}
