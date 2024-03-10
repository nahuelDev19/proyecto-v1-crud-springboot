package com.nahuel.avanza1.proyecto1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nahuel.avanza1.proyecto1.entitys.Producto;

public class ProductoRepository {


    
    private List<Producto> productos= new ArrayList<>();

    /**
    * Inicializa la lista de productos con algunos valores predeterminados.
    * Esta lista se utiliza para almacenar los productos disponibles en el sistema.
    */
        public void creearProductos(){
        productos= List.of(
            new Producto(1L,"manzana",2, 1000),
            new Producto(2L,"uvas",2, 1000),
            new Producto(3L,"pera",4, 1000),
            new Producto(4L,"mandarina",5, 1000),
            new Producto(5L,"melon",21, 1000),
            new Producto(6L,"mango",4, 1000),
            new Producto(7L,"durazno",7, 1000)

        );
    }

    // metodo para mostrar todos los elementos de la lista

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

    public Producto update(Producto producto){
        int idp= 0;
        Long id=0L;
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getId()== producto.getId()){
                id=producto.getId();
                break;
            }
        }
        Producto pro= new Producto();
        pro.setId(id);
        pro.setNombre(producto.getNombre());
        pro.setPrecio(producto.getPrecio());
        pro.setCantidad(producto.getCantidad());
        productos.set(idp, pro);
        return pro;
    }

}
