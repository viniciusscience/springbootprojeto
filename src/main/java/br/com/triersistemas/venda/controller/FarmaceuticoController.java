package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Farmaceutico;
import br.com.triersistemas.venda.model.Farmaceuticomodel;
import br.com.triersistemas.venda.model.Greetingmodel;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/Farmaceutico")
public class FarmaceuticoController {

    private final static List<Farmaceutico> LIST = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Farmaceutico> consultar() {
        return LIST;
    }

    @PostMapping("/cadastrar-random")
    public List<Farmaceutico> cadastrarRandom() {
        LIST.add(new Farmaceutico());
        return LIST;
    }

    @PostMapping("/cadastrar")
    public List<Farmaceutico> cadastrar(@RequestBody Farmaceuticomodel model) {
        LIST.add(new Farmaceutico(model.getNome(), model.getAniver(), model.getCpf(), model.getID()));
        return LIST;
    }

    @DeleteMapping("/alterar/{index}")
    public List<Farmaceutico> remover(@PathVariable Integer index, @RequestBody Farmaceuticomodel model) {
        var contato = LIST.get(index);
        LIST.remove(contato);
        LIST.add(new Farmaceutico(model.getNome(), model.getAniver(), model.getCpf(),model.getID()));
        return LIST;
    }

    @DeleteMapping("/remover/{index}")
    public List<Farmaceutico> remover(@PathVariable int index) {
        LIST.remove(index);
        return LIST;


    }
}
