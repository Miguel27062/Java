package com.example.Estudiantes.Services;

import com.example.Estudiantes.Entity.Horarios;
import com.example.Estudiantes.Repository.HorariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorariosServices {

    @Autowired
    private HorariosRepository horariosRepository;
    public List<Horarios> listarhorarios(){
        return horariosRepository.findAll();

    }

    public Horarios guardarhorarios(Horarios horarios){
        return horariosRepository.save(horarios);

    }

    public Horarios obtenerHorariosPorId(Long id){
        return horariosRepository.findById(id).orElse(null);

    }

    public void eliminarHorariosPorId(Long id){
        horariosRepository.deleteById(id);
    }
}
