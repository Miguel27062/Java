package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Horarios")
@Data
public class Horarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idhorarios;

    private String diaclase;
    private String inicioclase;
    private String finclase;


    @ManyToMany
    @JoinTable(
            name = "horario_salon",
            joinColumns = @JoinColumn(name = "id_horario"),
            inverseJoinColumns = @JoinColumn(name= "id_salon")

    )

    private List<Salones> salones;

    public Horarios(Long idhorarios, String diaclase, String inicioclase, String finclase ) {
        this.idhorarios = idhorarios;
        this.diaclase = diaclase;
        this.inicioclase = inicioclase;
        this.finclase = finclase;


    }

    public Horarios() {

    }

}
