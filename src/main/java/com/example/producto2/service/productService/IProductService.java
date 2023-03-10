package com.example.producto2.service.productService;

import com.example.producto2.model.Producto;

import java.util.Optional;

public interface IProductService {
    Object findAll();
    Optional<Producto> findById(Long id);

    Producto create(Producto producto);

    Producto update(Producto producto);

    void delete(Long id);

}
