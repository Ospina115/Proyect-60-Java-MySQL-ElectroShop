package com.tiendaelectrica.cruds.productoproveedor.domain.service;

import com.tiendaelectrica.cruds.productoproveedor.domain.entity.ProductoProveedor;

public interface ProductoProveedorService {
    void addProductoProveedor(ProductoProveedor productoProveedor);
    ProductoProveedor findProductoProveedor(int id_producto, int id_proveedor);
    void deleteProductoProveedor(int id_producto, int id_proveedor);
}
