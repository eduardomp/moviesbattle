package com.example.moviesbattle.repository;

import com.example.moviesbattle.domain.Filme;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmeRepository extends CrudRepository<Filme,Integer>{
    Filme findByIMDBId(String IMDBId);
}
