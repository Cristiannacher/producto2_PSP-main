package com.example.producto2.repository;

import com.example.producto2.model.Menu;
import com.example.producto2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
