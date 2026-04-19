package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;
import java.util.List;

public class Temporada extends Midia {
    private Byte numeroDeEpisodios;
    private Serie serie;
    private List<Episodio> episodios;

    public Temporada(){}

    public Temporada(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao, Byte numeroDeEpisodios, Serie serie) {
        super(titulo, descricao, poster, genero, data, imdnAvalaiacao);
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.serie = serie;
    }

    public Byte getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void addEpisodio(Episodio episodio){
        this.episodios.add(episodio);
    }
}
