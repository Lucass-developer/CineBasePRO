package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;

public class Serie extends Midia {
    private Byte temporadas;
    private Byte episodiosPorTemporada;

    public Serie() {}

    public Serie(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao, Byte temporadas, Byte episodiosPorTemporada) {
        super(titulo, descricao, poster, genero, data, imdnAvalaiacao);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}
