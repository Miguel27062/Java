package com.example.Estudiantes.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "Salones")
public class Salones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSalon;

    private String nombre_salon;
    private String capacidad;

    @ManyToMany(mappedBy = "salones")
    private List<Horarios> horarios;

    public Salones(Long idSalon, String nombre_salon, String capacidad) {
        this.idSalon = idSalon;
        this.nombre_salon = nombre_salon;
        this.capacidad = capacidad;
    }

    public Salones() {
    }
}
