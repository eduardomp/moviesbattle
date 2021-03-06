package com.example.moviesbattle.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="quiz")
public class Quiz {
    @Id
    private Integer id;

    @ManyToOne(targetEntity = Partida.class)
    private Partida partida;

    @ManyToOne(targetEntity = Par.class)
    private Par par;

    private String respostaJogador;



}
