package com.example.moviesbattle.domain;


import com.example.moviesbattle.enums.PartidaStatus;
import lombok.*;

import javax.persistence.*;

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

}
