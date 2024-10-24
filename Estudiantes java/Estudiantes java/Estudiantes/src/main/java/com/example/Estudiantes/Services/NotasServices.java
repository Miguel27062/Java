package com.example.Estudiantes.Services;

import com.example.Estudiantes.Entity.Notas;
import com.example.Estudiantes.Repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotasServices {
    @Autowired
    private NotasRepository notasRepository;

    public List<Notas> listarnotas(){
        return notasRepository.findAll();

    }
    public Notas guardarNota(Notas nota){
        return notasRepository.save(nota);
    }
    public Notas ubtenerNotaPorId(Long id){
        return  notasRepository.findById(id).orElse(null);

    }

    public void eliminarNotaPorId(Long id){
        notasRepository.deleteById(id);
    }
}
