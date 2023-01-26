package com.example.producto2.seeds;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import com.example.producto2.repository.MenuRepository;
import com.example.producto2.repository.ProductoRepository;

public class Seeds {
    private MenuRepository menuRepository;
    private ProductoRepository productoRepository;

    public Seeds(MenuRepository menuRepository) {this.menuRepository = menuRepository; }
    public Seeds(ProductoRepository productoRepository) {this.productoRepository = productoRepository;}

    public void generateSeeds(){

        Menu menuLibanes = new Menu("Jordan", 30.5);
        Menu menuVeggie = new Menu("Veggie", 20);
        Menu menuBurguer = new Menu("Libanes", 25);
        menuRepository.save(menuLibanes);
        menuRepository.save(menuVeggie);
        menuRepository.save(menuBurguer);

        Producto producto1 = new Producto("");
    }

}
