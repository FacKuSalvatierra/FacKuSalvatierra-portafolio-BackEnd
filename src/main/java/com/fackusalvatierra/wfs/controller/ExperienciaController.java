package com.fackusalvatierra.wfs.controller;


import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.models.Experiencia;
import com.fackusalvatierra.wfs.service.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    //editar experiencia
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExperiencia(experiencia);
        return  new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    //obtener experiencia a traves del ID
    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencia =experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }

    //Agregar Experiencia
    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }

    //Eliminar experincia a traves del ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
