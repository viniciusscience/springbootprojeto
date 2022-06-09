package br.com.triersistemas.venda.model;

import br.com.triersistemas.venda.domain.Produto;
import lombok.Getter;

@Getter
public class ItemPedidoModel {

    private Produto produto;
    private Integer QTD;
}
