package com.example.moviesbattle.domain;


import com.example.moviesbattle.enums.PartidaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name="partida")
public class Partida {
    @Id
    private Integer id;

    @ManyToOne(targetEntity = Jogador.class)
    private Jogador jogador;

    @Enumerated(EnumType.ORDINAL)
    private PartidaStatus partidaStatus;

    private int pontuacao;

    private int quantidadeErros;

}
