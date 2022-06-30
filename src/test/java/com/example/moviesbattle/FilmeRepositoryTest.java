package com.example.moviesbattle;

import com.example.moviesbattle.domain.Filme;
import com.example.moviesbattle.repository.FilmeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class FilmeRepositoryTest {

    @Autowired
    private FilmeRepository filmeRepository;

    @BeforeEach
    void init() {
        Filme filme = new Filme(1,"112233AA","Pulp Fiction",Double.parseDouble("1000000"), Double.parseDouble("8.1"),null);
        filmeRepository.save(filme);
    }

    @AfterEach
    public void destroyAll(){
        filmeRepository.deleteAll();
    }

    @Test
    void save_success(){
        Filme filme = new Filme(2,"223344BB","Sonic 2",Double.parseDouble("1000000"), Double.parseDouble("7.5"),null);
        Filme saved = filmeRepository.save(filme);
        assertThat(saved.getId()).isEqualTo(2);
        assertThat(saved.getPontuacao()).isEqualTo(Double.parseDouble("7500000"));
    }

    @Test
    void findByIMDBId_success(){
        Filme filme = filmeRepository.findByIMDBId("112233AA");
        assertThat(filme.getNome()).isEqualTo("Pulp Fiction");
    }

    @Test
    void pontuacao_success(){
        Filme filme = filmeRepository.findByIMDBId("112233AA");
        assertThat(filme.getPontuacao()).isEqualTo(Double.parseDouble("8100000"));
    }

}
