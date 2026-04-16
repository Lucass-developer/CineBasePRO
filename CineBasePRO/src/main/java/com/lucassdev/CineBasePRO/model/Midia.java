package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;

public abstract class Midia {
    private String titulo;
    private String descricao;
    private String poster;
    private Genero genero;
    private LocalDate data;
    private Double imdnAvalaiacao;

    public Midia() {}

    public Midia(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.poster = poster;
        this.genero = genero;
        this.data = data;
        this.imdnAvalaiacao = imdnAvalaiacao;
    }

    public void getDetalhes(){}
}
