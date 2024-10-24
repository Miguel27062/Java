package com.example.Estudiantes.Services;


import com.example.Estudiantes.Entity.Cursos;
import com.example.Estudiantes.Repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosServices {
    @Autowired
    private CursosRepository cursosRepository;


    public List<Cursos> listarCursos() {
        return cursosRepository.findAll();

    }
    public Cursos guardarCursos(Cursos cursos) {
        return cursosRepository.save(cursos);
    }

    public Cursos obtenerCursoPorId(Long id) {
        return cursosRepository.findById(id).orElse(null);

    }

    public void eliminarCurso(Long id) {
        cursosRepository.deleteById(id);
    }




}
