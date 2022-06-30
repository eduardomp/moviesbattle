package com.example.moviesbattle.services;

import com.example.moviesbattle.domain.Filme;
import com.example.moviesbattle.domain.Par;
import com.example.moviesbattle.domain.Partida;
import com.example.moviesbattle.domain.Quiz;
import com.example.moviesbattle.repository.FilmeRepository;
import com.example.moviesbattle.repository.ParRepository;
import com.example.moviesbattle.repository.PartidaRepository;
import com.example.moviesbattle.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private ParRepository parRepository;

    public Quiz criarNovoQuiz(Integer idPartida){

        List<Filme> filmes = (List<Filme>) this.filmeRepository.findAll();

        Random rand = new SecureRandom();

        int filmeAIndex = rand.nextInt(filmes.size());

        Filme filmeA = filmes.get(filmeAIndex);

        int filmeBIndex = rand.nextInt(filmes.size());

        Filme filmeB = filmes.get(filmeBIndex);

        Par par = new Par();

        par.setFilmeA(filmeA);
        par.setFilmeB(filmeB);

        Par parSaved = parRepository.save(par);

        //TODO Continuar a criação do QUIZ e associar a partida informada
        //TODO refactor para separar a logica em metodos menores

        //Optional<Partida> partidaOptional = this.partidaRepository.findById(idPartida);
        //Partida partida = partidaOptional.get();
        return null;
    }


}
