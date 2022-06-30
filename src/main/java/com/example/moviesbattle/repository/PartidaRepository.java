package com.example.moviesbattle.repository;

import com.example.moviesbattle.domain.Jogador;
import com.example.moviesbattle.domain.Partida;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartidaRepository extends CrudRepository<Partida, Integer> {
    List<Partida> findAllByJogador(Jogador jogador);
}

