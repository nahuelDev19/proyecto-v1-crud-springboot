package com.nahuel.avanza1.proyecto1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nahuel.avanza1.proyecto1.entitys.Producto;
import com.nahuel.avanza1.proyecto1.service.ProductoService;

@RestController
@RequestMapping("/api/v1")
public class ProductoControllers {


    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarTodo(){
        return productoService.listarTodo();
    }

    @PostMapping
    public Producto guardaProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @PutMapping
    public Producto modificarProducto(@RequestBody Producto producto){
        return productoService.actualizaProducto(producto);
    }



    @GetMapping("nombres/{nombre}")
    public List<Producto> buscaProductoNombre(@PathVariable String nombre){
        return productoService.buscaProductoNombe(nombre);
    }


    @GetMapping("productos/{id}")
    public Producto buscaProductoId(@PathVariable Long id){
        return productoService.buscarProductoId(id);
    }


    @DeleteMapping("eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        return productoService.eliminado(id);
    }

}
