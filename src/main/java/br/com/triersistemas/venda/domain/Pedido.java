package br.com.triersistemas.venda.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {

    private UUID id;
    private List<Produto> listaproduto;
    Cliente cliente;
    Double valor;
    public Pedido(){
        this.id=UUID.randomUUID();
        this.listaproduto= new ArrayList<>();
        this.valor=valor;

    }

    public UUID getId() {
        return id;
    }

    public List<Produto> getListaproduto() {
        return listaproduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getValor() {
        return valor;
    }
}
