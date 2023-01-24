package com.example.producto2.service.productService;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import com.example.producto2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProductService implements IProdcutService {
    @Autowired
    private ProductoRepository productoRepository;

    public Object findAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        Producto currentProduct = productoRepository.findById(producto.getId()).get();
        currentProduct.setDesc(producto.getDesc());
        currentProduct.setName(producto.getName());
        currentProduct.setTalla(producto.getTalla());
        return productoRepository.save(currentProduct);
    }
    @Override
    public void delete(Long id) {
        Optional<Producto> product = productoRepository.findById(id);
        System.out.println(product);
        productoRepository.deleteById(id);
    }

}
