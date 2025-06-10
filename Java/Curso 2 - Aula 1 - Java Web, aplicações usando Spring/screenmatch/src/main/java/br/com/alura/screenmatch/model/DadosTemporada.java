package br.com.alura.screenmatch.model;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") int temporada,
                            @JsonAlias("Episodes") List<DadosEpisodio> episodios) {

}
