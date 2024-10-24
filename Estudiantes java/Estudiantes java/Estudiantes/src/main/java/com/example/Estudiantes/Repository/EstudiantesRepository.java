package com.example.Estudiantes.Repository;

import com.example.Estudiantes.Entity.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudiantesRepository extends JpaRepository<Estudiantes, Long> {

}
