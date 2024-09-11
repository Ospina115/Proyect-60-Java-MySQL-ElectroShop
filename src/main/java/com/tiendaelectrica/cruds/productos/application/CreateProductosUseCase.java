package com.tiendaelectrica.cruds.productos.application;

import com.tiendaelectrica.cruds.productos.domain.entity.Productos;
import com.tiendaelectrica.cruds.productos.domain.service.ProductosService;

public class CreateProductosUseCase {
    private final ProductosService productosService;

    public CreateProductosUseCase(ProductosService productosService) {
        this.productosService = productosService;
    }

    public void execute(Productos productos) {
        productosService.CreateProductos(productos);
    }
}
