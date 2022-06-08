package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Farmaceutico;
import br.com.triersistemas.venda.domain.Fornecedor;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.model.Farmaceuticomodel;
import br.com.triersistemas.venda.model.Fornecedormodel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    private static final List<Fornecedor> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Fornecedor> consultar() {
        return LIST;
    }

    @PostMapping("/cadastrar-randon")
    public List<Fornecedor> cadastrarRandon() {
        LIST.add(new Fornecedor());
        return LIST;
    }

    @PostMapping("/cadastrar")
    public List<Fornecedor> cadastrar(@RequestBody Fornecedormodel model) {
        LIST.add(new Fornecedor(model.getNome(), model.getAniver(), model.getCnpj()));
        return LIST;
    }

    @DeleteMapping("/alterar/{id}")
    public List<Fornecedor> remover(@PathVariable UUID id, @RequestBody Fornecedormodel model) {
        var domain = LIST.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        domain.editar(model.getNome(), model.getAniver(), model.getCnpj());
        return LIST;
    }

    @DeleteMapping("/remover/{id}")
    public List<Fornecedor> remover(@PathVariable UUID id) {
        var domain = LIST.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        LIST.remove(domain);
        return LIST;
    }
}