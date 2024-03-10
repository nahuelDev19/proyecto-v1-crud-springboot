package com.nahuel.avanza1.proyecto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nahuel.avanza1.proyecto1.service.ProductoService;

@RestController
@RequestMapping("/api/v1")
public class ProductoControllers {


    @Autowired
    private ProductoService productoService;

    





}
