package com.tiendaelectrica.cruds.productos.domain.service;

import com.tiendaelectrica.cruds.productos.domain.entity.Productos;

public interface ProductosService {
    Productos FindProductosById(int id_producto);
    void CreateProductos(Productos productos);
    void UpdateProductos(Productos productos);
    void DeleteProductos(int id_producto);
}
