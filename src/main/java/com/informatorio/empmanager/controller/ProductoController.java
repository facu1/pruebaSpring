package com.informatorio.empmanager.controller;

import java.util.List;

import com.informatorio.empmanager.entity.Producto;
import com.informatorio.empmanager.repository.ProductoRepository;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

  @Autowired
  private ProductoRepository productoRepository;

  @GetMapping("/producto")
  public List<Producto> getAllProductos(@RequestParam String name) {
    return productoRepository.findAll();
  }

  @PostMapping("/producto")
  public ResponseEntity<?> crearProducto(@RequestBody Producto producto) {
    return new ResponseEntity<>(productoRepository.save(producto), HttpStatus.CREATED);
  }
}
