package com.fackusalvatierra.wfs.service;

import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    //Agregar educacion nueva
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }

    //Actualizacion de educacion
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    //Borrar educacion a traves del ID
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
