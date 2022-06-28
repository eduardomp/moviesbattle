package com.example.moviesbattle.domain;

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
@Table(name="par")
public class Par {
    @Id
    private Integer id;

    @ManyToOne(targetEntity = Filme.class)
    private Integer idFilmeA;

    @ManyToOne(targetEntity = Filme.class)
    private Integer idFilmeB;

    private String resposta;


}
