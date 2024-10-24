package com.example.Estudiantes.Services;


import com.example.Estudiantes.Entity.Profesores;
import com.example.Estudiantes.Repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class ProfesoresServices {

    @Autowired
    private ProfesoresRepository profesoresRepository;

    public List<Profesores> listarProfesores() {
        return profesoresRepository.findAll();
    }
    public Profesores guardarProfesores(Profesores profesore) {
        return profesoresRepository.save(profesore);
    }

    public Profesores obtenerProfesores(Long id) {
        return profesoresRepository.getById(id);
    }
    public void eliminarProfesores(Long id) {
        profesoresRepository.deleteById(id);
    }
}
