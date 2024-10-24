package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Notas")
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    private Double calificacion;

    @ManyToMany
    @JoinTable(
            name = "nota_estudiante",
            joinColumns = @JoinColumn(name = "nota_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private List<Estudiantes> idestudiante;

    public Notas(Long idNota, Double calificacion) {
        this.idNota = idNota;
        this.calificacion = calificacion;
    }

    public Notas() {
    }
}
