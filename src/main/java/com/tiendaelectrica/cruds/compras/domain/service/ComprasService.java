package com.tiendaelectrica.cruds.compras.domain.service;

import com.tiendaelectrica.cruds.compras.domain.entity.Compras;

public interface ComprasService {
    Compras FindComprasById(int id);
    void CreateCompras(Compras compras);
    void UpdateCompras(Compras compras);
    void DeleteCompras(int id);
}
