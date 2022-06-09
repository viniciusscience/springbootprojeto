package br.com.triersistemas.venda.model;

import br.com.triersistemas.venda.enuns.EnumStatusPedido;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
public class PedidoModel {

    private UUID idFarmaceutico;
    private UUID idCliente;
}