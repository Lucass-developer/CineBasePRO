package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;

public class Filme extends Midia {
    private Double duracaoEmMinutos;

    public Filme() {}

    public Filme(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao, Double duracaoEmMinutos) {
        super(titulo, descricao, poster, genero, data, imdnAvalaiacao);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
