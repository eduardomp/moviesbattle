package com.example.moviesbattle;

import com.example.moviesbattle.domain.Jogador;
import com.example.moviesbattle.domain.Partida;
import com.example.moviesbattle.enums.PartidaStatus;
import com.example.moviesbattle.repository.JogadorRepository;
import com.example.moviesbattle.repository.PartidaRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class PartidaRepositoryTest {

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    @BeforeEach
    void init(){
        Jogador jogador = new Jogador(1, "Teste","teste@tstt.net","asdf");
        jogadorRepository.save(jogador);
    }

    @AfterEach
    public void deleteAll(){
        jogadorRepository.deleteAll();
        partidaRepository.deleteAll();
    }

    @Test
    void criarNovaPartida_success(){
        Optional<Jogador> jogadorOptional = jogadorRepository.findById(1);

        Jogador jogador = jogadorOptional.get();

        Partida partida = new Partida();
        partida.setId(1);
        partida.setJogador(jogador);
        partida.setPartidaStatus(PartidaStatus.INICIADA);
        partida.setPontuacao(0);
        partida.setQuantidadeErros(0);

        Partida saved = partidaRepository.save(partida);

        assertThat(saved).isNotNull();
        assertThat(saved.getId()).isGreaterThan(0);

        List<Partida> partidas = partidaRepository.findAllByJogador(jogador);

        assertThat(partidas.size()).isEqualTo(1);

    }

}
