package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCursos;

    private String nombre_curso;

    @ManyToMany
    @JoinTable(
            name = "curso_profesor",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "profesor_id")
    )
    private List<Profesores> idprofesores;

    public Cursos(Long idCursos, String nombre_curso) {
        this.idCursos = idCursos;
        this.nombre_curso = nombre_curso;
    }

    public Cursos() {
    }
}
