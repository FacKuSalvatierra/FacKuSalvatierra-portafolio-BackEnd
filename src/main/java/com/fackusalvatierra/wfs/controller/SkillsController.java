package com.fackusalvatierra.wfs.controller;

import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.models.Skills;
import com.fackusalvatierra.wfs.service.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {

    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    //Editar la skills
    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkills(skills);
        return  new ResponseEntity<>(skills, HttpStatus.OK);
    }

    //obtener skills a traves del ID
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills =skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    //Agregar Skills
    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills=skillsService.addSkills(skills);
        return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
    }

    //Eliminar Skills a traves del ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}