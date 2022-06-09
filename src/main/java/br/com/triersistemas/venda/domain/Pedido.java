package br.com.triersistemas.venda.domain;

import br.com.triersistemas.venda.helper.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {

    private UUID id;
    private List<String> listaproduto;
    private Cliente cliente;
    private Double valor;
    private LocalDate dataPagamento;
    private double valorPago;
    private Status status;

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public Status getStatus() {
        return status;
    }

    public Pedido() {
        this.id = UUID.randomUUID();
        this.listaproduto = StringUtils.getRandomListMedicine();
        this.cliente=new Cliente();
        this.dataPagamento=LocalDate.now();
        this.valor = valor;
        this.status=Status.PENDENTE;

      

    }
    
    public Pedido(UUID id, List<String> listaproduto,String cliente){
        this.id = id;
        this.listaproduto=listaproduto;
        this.cliente=new Cliente();

    }

    public UUID getId() {
        return id;
    }

    public List<String> getListaproduto() {
        return listaproduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void editar(String nome, Double valor, UUID id,List<String> listaproduto) {
    }
}
