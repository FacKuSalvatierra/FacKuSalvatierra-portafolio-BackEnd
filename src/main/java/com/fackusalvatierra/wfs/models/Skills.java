package com.fackusalvatierra.wfs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private String fotoSkill;
    private int porcenSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, String fotoSkill, int porcenSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.fotoSkill = fotoSkill;
        this.porcenSkill = porcenSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getFotoSkill() {
        return fotoSkill;
    }

    public void setFotoSkill(String fotoSkill) {
        this.fotoSkill = fotoSkill;
    }

    public int getPorcenSkill() {
        return porcenSkill;
    }

    public void setPorcenSkill(int porcenSkill) {
        this.porcenSkill = porcenSkill;
    }
}
