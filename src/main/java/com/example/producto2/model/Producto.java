package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name= "Producto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String desc;
    private double talla;

    public Producto(String name, int talla) {
        this.setDesc(name);
        this.setTalla(talla);
    }

    public Producto(){
    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public String getDesc() { return desc; }

    public void setDesc(String name) { this.desc = name; }

    public double getTalla() { return talla; }

    public void setTalla(double talla) { this.talla = talla; }
}
