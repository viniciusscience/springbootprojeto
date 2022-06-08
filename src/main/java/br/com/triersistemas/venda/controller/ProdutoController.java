package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Cliente;
import br.com.triersistemas.venda.domain.Produto;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.helper.StringUtils;
import br.com.triersistemas.venda.model.ClienteModel;
import br.com.triersistemas.venda.model.Farmaceuticomodel;
import br.com.triersistemas.venda.model.ProdutoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private static final List<Produto> LISTA = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Produto> consultar() {
        return LISTA;
    }

    @PostMapping("/cadastrar-randon")
    public List<Produto> cadastrarRandon() {
        LISTA.add(new Produto());
        return LISTA;
    }

    @PostMapping("/cadastrar")
    public List<Produto> cadastrar(@RequestBody ProdutoModel model) {
        LISTA.add(new Produto(model.getNome(),model.getId(), model.getValor()));
        return LISTA;
    }

    @PutMapping("/alterar/{id}")
    public List<Produto> remover(@PathVariable UUID id, @RequestBody ProdutoModel model) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        domain.editar(model.getNome(), model.getValor(), model.getId());
        return LISTA;
    }

    @DeleteMapping("/remover/{id}")
    public List<Produto> remover(@PathVariable UUID id) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        LISTA.remove(domain);
        return LISTA;
    }
}

