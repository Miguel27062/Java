package com.example.Estudiantes.Controller;

import com.example.Estudiantes.Entity.Cursos;
import com.example.Estudiantes.Repository.CursosRepository;
import com.example.Estudiantes.Services.CursosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;
    @Autowired
    private CursosServices cursosServices;

    @GetMapping
    public List<Cursos> listarCursos(){
        return cursosServices.listarCursos();

    }

    @PostMapping
    public Cursos guardarCursos(@RequestBody Cursos cursos){
        return cursosServices.guardarCursos(cursos);

    }

    @GetMapping("/{id}")
    public Cursos obtenerCursos(@PathVariable Long id){
        return cursosServices.obtenerCursoPorId(id);

    }

    @DeleteMapping
    public void eliminarCursos(@PathVariable Long id){
        cursosServices.eliminarCurso(id);

    }
    @GetMapping
    public Cursos buscarCursos(@PathVariable Long id){
        return cursosServices.obtenerCursoPorId(id);

    }



}
