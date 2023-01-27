package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name= "Producto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String desc;

    private double precio;
    private double talla;


    public Producto(String name,String desc, double precio, int talla) {
        this.setNombre(nombre);
        this.setDesc(desc);
        this.setPrecio(precio);
        this.setTalla(talla);
    }

    public Producto(){
    }

    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDesc() { return desc; }

    public void setDesc(String name) { this.desc = name; }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getTalla() { return talla; }

    public void setTalla(double talla) { this.talla = talla; }
}
