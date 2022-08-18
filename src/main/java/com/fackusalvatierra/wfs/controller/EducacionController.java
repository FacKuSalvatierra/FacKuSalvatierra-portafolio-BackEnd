package com.fackusalvatierra.wfs.controller;

import com.fackusalvatierra.wfs.models.Educacion;
import com.fackusalvatierra.wfs.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/educacion")
public class EducacionController {

    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    //Editar la educacion
    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return  new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    //obtener educacion a traves del ID
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educaciones =educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    //Agregar Educacion
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion=educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }

    //Eliminar educacion a traves del ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
