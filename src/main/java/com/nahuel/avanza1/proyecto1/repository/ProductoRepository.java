package com.nahuel.avanza1.proyecto1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.nahuel.avanza1.proyecto1.entitys.Producto;

@Repository
public class ProductoRepository {


    
    private List<Producto> productos= new ArrayList<>();





    public List<Producto> listar(){
        return productos;
    }


    // metodo de busqueda por id
    public Producto buscarPorId(Long id){
        for(Producto producto: productos){
            if (producto.getId()==id) {
                return producto;
            }
        }
        return null;
    }


    // metodo para buscar productos por nombre


    public List<Producto >buscarPorNombre(String nombre){
        return  productos.stream()
        .filter(x-> x.getNombre().startsWith(nombre))
        .collect(Collectors.toList());
    }


    //metodo de guadado

    public Producto guardar(Producto p){
        Producto newProducto= new Producto();
        newProducto.setId(p.getId());
        newProducto.setNombre(p.getNombre());
        newProducto.setCantidad(p.getCantidad());
        newProducto.setPrecio(p.getPrecio());

        productos.add(newProducto);
        return newProducto;
    }


    // metodo de eliminacion

    public String eliminar(Long id){
        productos.removeIf(x-> x.getId()==id);
        return "usuario eliminado";
    }


    // metodo de actualizacion de productos

    public Producto update(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            Producto existingProducto = productos.get(i);
            if (existingProducto.getId().equals(producto.getId())) {
                existingProducto.setNombre(producto.getNombre());
                existingProducto.setPrecio(producto.getPrecio());
                existingProducto.setCantidad(producto.getCantidad());
                return existingProducto; // Retorna el producto actualizado
            }
        }
        
        return null; 
    }
    

}
