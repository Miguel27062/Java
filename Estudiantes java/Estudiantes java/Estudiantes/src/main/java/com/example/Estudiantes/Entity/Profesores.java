package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Profesores")

public class Profesores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @ManyToMany(mappedBy = "idprofesores")

    private List<Cursos> cursos;

    public Profesores(Long idProfesor, String nombre, String apellido, String telefono, String email){

        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;

    }
    public Profesores() {

    }
}
