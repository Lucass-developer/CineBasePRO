package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;

public abstract class Midia {
    private String titulo;
    private String descricao;
    private String poster;
    private Genero genero;
    private LocalDate dataDeLancamento;
    private Double imdnAvalaiacao;
    private Ator ator;
    private Diretor diretor;

    public Midia() {}

    public Midia(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.poster = poster;
        this.genero = genero;
        this.dataDeLancamento = data;
        this.imdnAvalaiacao = imdnAvalaiacao;
    }

    public void getDetalhes(){}

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPoster() {
        return poster;
    }

    public Genero getGenero() {
        return genero;
    }

    public LocalDate getData() {
        return dataDeLancamento;
    }

    public Double getImdnAvalaiacao() {
        return imdnAvalaiacao;
    }
}
