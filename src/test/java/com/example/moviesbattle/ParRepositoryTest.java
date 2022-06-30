package com.example.moviesbattle;

import com.example.moviesbattle.domain.Filme;
import com.example.moviesbattle.domain.Par;
import com.example.moviesbattle.repository.FilmeRepository;
import com.example.moviesbattle.repository.ParRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class ParRepositoryTest {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private ParRepository parRepository;

    @BeforeEach
    void init() {
        Filme filmeA = new Filme(1,"112233AA","Pulp Fiction",new Double("1000000"), new Double("8.1"),null);
        filmeRepository.save(filmeA);

        Filme filmeB = new Filme(2,"112233BB","Sonic 2",new Double("1000000"), new Double("7.5"),null);
        filmeRepository.save(filmeB);

        Par par = new Par(1,filmeA,filmeB,null);

        parRepository.save(par);
    }

    @AfterEach
    public void destroyAll(){
        filmeRepository.deleteAll();
        parRepository.deleteAll();
    }

    @Test
    void resposta_success(){
        Optional<Par> optionalPar = parRepository.findById(1);
        Par par = optionalPar.get();
        assertThat(par.getResposta()).isEqualTo("A");
    }

}
