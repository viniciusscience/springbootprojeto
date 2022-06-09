package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.ItemPedido;
import br.com.triersistemas.venda.domain.Pedido;
import br.com.triersistemas.venda.domain.Produto;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.model.*;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/itempedido")
public class ItemPedidoController {

    public class PedidoController {

        public static final List<ItemPedido> LIST = new ArrayList<>();

        @PostMapping("/Cadastrar")
        public List<ItemPedido> Cadastrar(@RequestBody ItemPedidoModel model) {
            var itemPedido = ProdutoController.LIST.stream().count();

            return LIST;
        }

    }
}
