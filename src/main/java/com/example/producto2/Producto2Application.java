package com.example.producto2;

import com.example.producto2.repository.ProductoRepository;
import com.example.producto2.seeds.Seeds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.producto2.repository.MenuRepository;

@SpringBootApplication
public class Producto2Application {
    @Autowired
    MenuRepository menuRepository;
    @Autowired
    ProductoRepository productoRepository;


    public static void main(String[] args) {
        SpringApplication.run(Producto2Application.class,args);
    }

    @Bean
    void commandLineRunner(){
        Seeds seeds = new Seeds(menuRepository);
        Seeds seeds1 = new Seeds(productoRepository);
        seeds.generateSeeds();
        seeds1.generateSeeds();
    }
}
