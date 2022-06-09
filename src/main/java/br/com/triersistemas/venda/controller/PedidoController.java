package br.com.triersistemas.venda.controller;


import br.com.triersistemas.venda.domain.Cliente;
import br.com.triersistemas.venda.domain.Pedido;
import br.com.triersistemas.venda.domain.Produto;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.model.PedidoModel;
import br.com.triersistemas.venda.model.ProdutoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    private static final List<Pedido> LISTA = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Pedido> consultar() {
        return LISTA;
    }

    @PostMapping("/cadastrar-randon")
    public List<Pedido>cadastrarRandon() {
        LISTA.add(new Pedido());

        return LISTA;
    }

    @PostMapping("/cadastrar")
    public List<Pedido> cadastrar(@RequestBody PedidoModel model) {
        LISTA.add(new Pedido(model.getId(), model.getListaproduto(), model.getCliente()));
        return LISTA;
    }

    @PutMapping("/alterar/{id}")
    public List<Pedido> remover(@PathVariable UUID id, @RequestBody PedidoModel model) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        domain.editar(model.getNome(), model.getValor(), model.getId(),model.getListaproduto());
        return LISTA;
    }

    @DeleteMapping("/remover/{id}")
    public List<Pedido> remover(@PathVariable UUID id) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        LISTA.remove(domain);
        return LISTA;
    }
}



