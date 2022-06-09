package br.com.triersistemas.venda.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemPedido {
    private  UUID id;
    private Produto produto;
    private Integer QTD;
    private BigDecimal valor;

    public ItemPedido(final Produto produto,final Integer QTD) {
        this.id = UUID.randomUUID();
        this.produto = produto;
        this.QTD = QTD;
        this.valor = valor;
    }
    public int soma(){
        int soma =0;
        soma++;
        return soma;
    }

}

