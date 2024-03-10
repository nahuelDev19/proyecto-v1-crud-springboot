package com.nahuel.avanza1.proyecto1.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private Long id;
    private String nombre;
    private int cantidad;
    private double precio;

}
