package com.example.producto2.seeds;

import com.example.producto2.model.Marca;
import com.example.producto2.model.Producto;
import com.example.producto2.repository.MarcaRepository;
import com.example.producto2.repository.ProductoRepository;

public class Seeds {
    private MarcaRepository menuRepository;
    private ProductoRepository productoRepository;

    public Seeds(MarcaRepository menuRepository, ProductoRepository productoRepository) {this.menuRepository = menuRepository; this.productoRepository = productoRepository;}

    public void generateSeeds(){

        Marca marcaJordan = new Marca("Jordan");
        Marca marcaAdidas = new Marca("Adidas");
        Marca marcaNike = new Marca("Nike");
        menuRepository.save(marcaJordan);
        menuRepository.save(marcaAdidas);
        menuRepository.save(marcaNike);

        Producto producto1 = new Producto("zapatilla1","zapatillas rojas y negras",134.6,45);
        Producto producto2 = new Producto("zapatilla2","zapatillas verdes y negras",145.43,35);
        Producto producto3 = new Producto("zapatilla3","zapatillas azul y negras",200,43);
        productoRepository.save(producto1);
        productoRepository.save(producto2);
        productoRepository.save(producto3);
    }

}
