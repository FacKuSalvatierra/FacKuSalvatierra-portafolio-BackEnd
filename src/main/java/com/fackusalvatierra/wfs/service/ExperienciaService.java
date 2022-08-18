package com.fackusalvatierra.wfs.service;


import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.models.Experiencia;
import com.fackusalvatierra.wfs.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    //Agregar experiencia nueva
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExperiencia(){
        return experienciaRepo.findAll();
    }

    //Actualizacion de experiencia
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    //Borrar experiencia a traves del ID
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}
