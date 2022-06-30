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
@Table(name="par")
public class Par {
    @Id
    private Integer id;

    @ManyToOne(targetEntity = Filme.class)
    private Filme filmeA;

    @ManyToOne(targetEntity = Filme.class)
    private Filme filmeB;

    @Setter(AccessLevel.NONE)
    private String resposta;

    public String getResposta(){
        if(this.filmeA.getPontuacao() > this.getFilmeB().getPontuacao()){
            return "A";
        }
        return "B";
    }



}
