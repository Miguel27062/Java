package com.example.Estudiantes.Services;

import com.example.Estudiantes.Entity.Estudiantes;
import com.example.Estudiantes.Repository.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EstudiantesServices {

    @Autowired
    private EstudiantesRepository estudiantesRepository;
    public List<Estudiantes> listarEstudiantes(){
        return estudiantesRepository.findAll();

    }

    public Estudiantes guardarEstudiantes(Estudiantes estudiantes){
        return estudiantesRepository.save(estudiantes);

    }

    public Estudiantes obtenerEstudiantesId(Long id){
        return estudiantesRepository.findById(id).orElse(null);
    }

    public void eliminarEstudiantes(Long id){
        estudiantesRepository.deleteById(id);
    }

}
