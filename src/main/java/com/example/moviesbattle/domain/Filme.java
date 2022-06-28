package com.example.moviesbattle.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
@Getter
@Setter
@ToString
@Data
@Builder

@Entity
@Table(name="filme")
public class Filme {

    @Id
    private Integer id;

    private String idImdb;

    private String nome;

    private Integer votos;

    private Double nota;

    private Double pontuacao;

}
