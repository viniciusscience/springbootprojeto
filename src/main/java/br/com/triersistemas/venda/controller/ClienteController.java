package br.com.triersistemas.venda.controller;

import br.com.triersistemas.venda.domain.Cliente;
import br.com.triersistemas.venda.exceptions.NaoExisteException;
import br.com.triersistemas.venda.model.Farmaceuticomodel;

import br.com.triersistemas.venda.model.ClienteModel;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private static final List<Cliente> LISTA = new ArrayList<>();

    @GetMapping("/consultar")
    public List<Cliente> consultar() {
        return LISTA;
    }

    @PostMapping("/cadastrar-randon")
    public List<Cliente> cadastrarRandon() {
        LISTA.add(new Cliente());
        return LISTA;
    }

    @PostMapping("/cadastrar")
    public List<Cliente> cadastrar(@RequestBody Farmaceuticomodel farmaceuticomodel) {
        LISTA.add(new Cliente());
        return LISTA;
    }

    @PutMapping("/alterar/{id}")
    public List<Cliente> remover(@PathVariable UUID id, @RequestBody ClienteModel clientemodel) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        domain.editar(clientemodel.getNome(),clientemodel.getAniver(),clientemodel.getCpf());
        return LISTA;
    }

    @DeleteMapping("/remover/{id}")
    public List<Cliente> remover(@PathVariable UUID id) {
        var domain = LISTA.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst()
                .orElseThrow(NaoExisteException::new);
        LISTA.remove(domain);
        return LISTA;
    }
}