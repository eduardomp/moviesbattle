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
