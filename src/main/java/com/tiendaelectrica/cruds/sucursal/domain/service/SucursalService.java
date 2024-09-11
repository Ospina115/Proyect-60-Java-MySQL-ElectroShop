package com.tiendaelectrica.cruds.sucursal.domain.service;

import com.tiendaelectrica.cruds.sucursal.domain.entity.Sucursal;

public interface SucursalService {
    void addSucursal(Sucursal sucursal);
    Sucursal findSucursalById(int id_sucursal);
    void updateSucursal(Sucursal sucursal);
    void deleteSucursal(int id_sucursal);
}
