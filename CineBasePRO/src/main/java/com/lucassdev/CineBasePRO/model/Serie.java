package com.lucassdev.CineBasePRO.model;

import java.time.LocalDate;
import java.util.List;

public class Serie extends Midia {
    private List<Temporada> temporadas;

    public Serie() {}

    public Serie(String titulo, String descricao, String poster, Genero genero, LocalDate data, Double imdnAvalaiacao) {
        super(titulo, descricao, poster, genero, data, imdnAvalaiacao);
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void addTemporada(Temporada temporada){
        this.temporadas.add(temporada);
    }

}
