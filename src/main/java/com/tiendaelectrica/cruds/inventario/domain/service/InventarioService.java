package com.tiendaelectrica.cruds.inventario.domain.service;

import com.tiendaelectrica.cruds.inventario.domain.entity.Inventario;

public interface InventarioService {
    Inventario findInventarioById(int id_inventario);
    void createInventario(Inventario inventario);
    void updateInventario(Inventario inventario);
    void deleteInventario(int id_inventario);
}
