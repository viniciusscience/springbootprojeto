package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Farmaceutico;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.model.Farmaceuticomodel;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {

    private static final List<Farmaceutico> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Farmaceutico> consultar() {
        return LIST;
    }

    @PostMapping("/cadastrar-randon")
    public List<Farmaceutico> cadastrarRandon() {
        LIST.add(new Farmaceutico());
        return LIST;
    }

    @PostMapping("/cadastrar")
    public List<Farmaceutico> cadastrar(@RequestBody Farmaceuticomodel model) {
        LIST.add(new Farmaceutico(model.getNome(), model.getAniver(), model.getCpf()));
        return LIST;
    }

    @PutMapping("/alterar/{id}")
    public List<Farmaceutico> remover(@PathVariable UUID id, @RequestBody Farmaceuticomodel model) {
        var domain = LIST.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        domain.editar(model.getNome(), model.getAniver(), model.getCpf());
        return LIST;
    }

    @DeleteMapping("/remover/{id}")
    public List<Farmaceutico> remover(@PathVariable UUID id) {
        var domain = LIST.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        LIST.remove(domain);
        return LIST;
    }
}