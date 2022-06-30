package com.example.moviesbattle.services;

import com.example.moviesbattle.domain.Jogador;
import com.example.moviesbattle.domain.Partida;
import com.example.moviesbattle.enums.PartidaStatus;
import com.example.moviesbattle.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    public Partida criarNovaPartida(Jogador jogador) {
        Partida partida = new Partida();
        partida.setJogador(jogador);
        partida.setPartidaStatus(PartidaStatus.INICIADA);
        partida.setPontuacao(0);
        partida.setQuantidadeErros(0);

        Partida saved = this.partidaRepository.save(partida);

        return saved;

    }

}
