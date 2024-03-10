package com.nahuel.avanza1.proyecto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nahuel.avanza1.proyecto1.entitys.Producto;
import com.nahuel.avanza1.proyecto1.repository.ProductoRepository;

@Service
public class ProductoService {

    /**
    * Repositorio de productos que se inyecta automáticamente mediante la anotación @Autowired.
    */
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarTodo(){
        return productoRepository.listar();
    }


    public Producto saveProducto(Producto producto){
        return productoRepository.guardar(producto);
    }

    public String eliminado(Long id){
        return productoRepository.eliminar(id);
    }


    public Producto actualizaProducto(Producto producto){
        return productoRepository.update(producto);
    }


    public List<Producto> buscaProductoNombe(String nombre){
        return productoRepository.buscarPorNombre(nombre);
    }

public Producto buscarProductoId(Long id){
    return productoRepository.buscarPorId(id);
}



}
