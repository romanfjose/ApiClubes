package com.example.newteamapi.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;
    private String  nombre;
    private Integer ranking;
    private String  adc;
    private String  mid;
    private String  top;
    private String  support;
    private String  jungla;  

    public Team() {
    }

    public Team(Integer id, String nombre, Integer ranking, String adc, String mid, String top, String support,
                 String jungla) {
        this.id = id;
        this.nombre = nombre;
        this.ranking = ranking;
        this.adc = adc;
        this.mid = mid;
        this.top = top;
        this.support = support;
        this.jungla = jungla;     
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getRanking() {
        return ranking;
    }
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
    public String getAdc() {
        return adc;
    }
    public void setAdc(String adc) {
        this.adc = adc;
    }
    public String getMid() {
        return mid;
    }
    public void setMid(String mid) {
        this.mid = mid;
    }
    public String getTop() {
        return top;
    }
    public void setTop(String top) {
        this.top = top;
    }
    public String getSupport() {
        return support;
    }
    public void setSupport(String support) {
        this.support = support;
    }
    public String getJungla() {
        return jungla;
    }
    public void setJungla(String jungla) {
        this.jungla = jungla;
    }    

}