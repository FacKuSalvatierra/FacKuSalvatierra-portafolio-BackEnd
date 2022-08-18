package com.fackusalvatierra.wfs.service;

import com.fackusalvatierra.wfs.models.Skills;
import com.fackusalvatierra.wfs.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    //Agregar skill nueva
    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    public List<Skills> buscarSkills(){
        return skillsRepo.findAll();
    }

    //Actualizacion de Skills
    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    //Borrar skills a traves del ID
    public void borrarSkills(Long id){
       skillsRepo.deleteById(id);
    }
}
