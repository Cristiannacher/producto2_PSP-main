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

        Producto producto1 = new Producto("zapatila negra",45);
        Producto producto2 = new Producto("zapatila roja",40);
        Producto producto3 = new Producto("zapatila verde",35);
        productoRepository.save(producto1);
        productoRepository.save(producto2);
        productoRepository.save(producto3);
    }

}
