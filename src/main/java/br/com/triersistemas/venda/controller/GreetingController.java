package br.com.triersistemas.venda.controller;

import java.util.concurrent.atomic.AtomicLong;

import br.com.triersistemas.venda.model.Greetingmodel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/contato")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greetingmodel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greetingmodel(counter.incrementAndGet(), String.format(template, name));
    }
}