package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Farmaceutico;
import br.com.triersistemas.venda.domain.Fornecedor;
import br.com.triersistemas.venda.model.Farmaceuticomodel;
import br.com.triersistemas.venda.model.Fornecedormodel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Fornecedor")
public class FornecedorController {

    private final static List<Fornecedor> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Fornecedor> consultar() {
        return LIST;
    }

    @PostMapping("/cadastrar-random")

    public List<Fornecedor> cadastrarRandom() {
        LIST.add(new Fornecedor());
        return LIST;
    }

    @PostMapping("/cadastrar")
    public List<Fornecedor> cadastrar(@RequestBody Fornecedormodel model) {
        LIST.add(new Fornecedor(model.getNome(), model.getAniver(), model.getCnpj(),model.getID()));
        return LIST;
    }

    @DeleteMapping("/alterar/{index}")
    public List<Fornecedor> remover(@PathVariable Integer index, @RequestBody Fornecedormodel model) {
        var contato = LIST.get(index);
        LIST.remove(contato);
        LIST.add(new Fornecedor(model.getNome(), model.getAniver(), model.getCnpj(),model.getID()));
        return LIST;
    }

    @DeleteMapping("/remover/{index}")
    public List<Fornecedor> remover(@PathVariable int index) {
        LIST.remove(index);
        return LIST;


    }
}


