package com.example.moviesbattle.domain;

import lombok.AccessLevel;
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
@Table(name="filme")
public class Filme {

    @Id
    private Integer id;

    private String IMDBId;

    private String nome;

    private Double votos;

    private Double nota;

    @Setter(AccessLevel.NONE)
    private Double pontuacao;

    public Double getPontuacao(){
        if(this.votos != null && this.nota != null){
            this.pontuacao = this.votos * this.nota;
            return this.pontuacao;
        }
        return 0.0;
    }

}
