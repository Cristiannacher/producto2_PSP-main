package com.example.producto2.service.marcaService;

import com.example.producto2.model.Marca;
import com.example.producto2.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MarcaService implements IMarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public Object findAll() {
        return this.marcaRepository.findAll();
    }

    @Override
    public Optional<Marca> findById(Long id) {
        return marcaRepository.findById(id);
    }

    @Override
    public Marca create(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca update(Marca marca) {
        Marca currentMenu = marcaRepository.findById(marca.getId()).get();
        currentMenu.setName(marca.getName());
        return marcaRepository.save(currentMenu);
    }
    @Override
    public void delete(Long id) {
        Optional<Marca> marca = marcaRepository.findById(id);
        System.out.println(marca);
        marcaRepository.deleteById(id);
    }

}
