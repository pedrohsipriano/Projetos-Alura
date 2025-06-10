package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Title") String titulo, 
                            @JsonAlias("Epsode") int numero,
                            @JsonAlias("imdbRating") String avaliacao) {

}
