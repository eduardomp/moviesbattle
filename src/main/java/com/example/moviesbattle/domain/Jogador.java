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
@Table(name="jogador")
public class Jogador {
    @Id
    private Integer id;

    private String nome;

    private String email;

    private String senha;

}
