package com.example.Estudiantes.Services;


import com.example.Estudiantes.Entity.Salones;
import com.example.Estudiantes.Repository.SalonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonesServices {

    @Autowired
    private SalonesRepository salonesRepository;

    public List<Salones> listarSalones(){
        return salonesRepository.findAll();

    }

    public Salones guardarSalones(Salones salones){
        return salonesRepository.save(salones);
    }

    public Salones obtenerSalones(Long id){
        return salonesRepository.findById(id).orElse(null);
    }
    public void eliminarSalones(Long id){
        salonesRepository.deleteById(id);
    }

}
