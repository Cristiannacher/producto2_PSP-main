package com.example.producto2.model;

import javax.persistence.*;

@Entity
@Table(name= "Producto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String descripcion;

    private double precio;
    private double talla;


    public Producto(String name,String descripcio, double precio, int talla) {
        this.setNombre(name);
        this.setDescripcion(descripcio);
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

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String name) { this.descripcion = name; }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getTalla() { return talla; }

    public void setTalla(double talla) { this.talla = talla; }
}
