package br.com.triersistemas.venda.model;

public class Greetingmodel {



    private final long id;
    private final String content;

    public Greetingmodel(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
