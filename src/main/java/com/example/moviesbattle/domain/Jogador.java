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
