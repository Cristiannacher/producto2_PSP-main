package com.example.producto2.service.marcaService;

import com.example.producto2.model.Marca;

import java.util.Optional;

public interface IMarcaService {
    Object findAll();
    Optional<Marca> findById(Long id);
    Marca create(Marca marca);
    Marca update(Marca marca);
    void delete(Long id);

}
