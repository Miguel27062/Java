package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "estudiantes")

public class Estudiantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiantes;

    private String nombre_estudiantes;
    private String apellido_estudiantes;
    private String telefono_estudiantes;
    private String correo_estudiantes;


    @ManyToMany
    @JoinTable(
            name = "estudiante_profesores",
            joinColumns = @JoinColumn(name = "id_estudiante"),
            inverseJoinColumns = @JoinColumn( name = "id_profesor")

    )
    private List<Profesores> profesores;

    public Estudiantes(Long idEstudiantes, String nombre_estudiantes, String apellido_estudiantes, String telefono_estudiantes, String correo_estudiantes){

        this.idEstudiantes = idEstudiantes;
        this.nombre_estudiantes = nombre_estudiantes;
        this.apellido_estudiantes = apellido_estudiantes;
        this.telefono_estudiantes = telefono_estudiantes;
        this.correo_estudiantes = correo_estudiantes;

    }

    public Estudiantes(){

    }





}
