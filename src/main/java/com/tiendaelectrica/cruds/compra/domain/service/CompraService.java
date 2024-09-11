package com.tiendaelectrica.cruds.compra.domain.service;

import com.tiendaelectrica.cruds.compra.domain.entity.Compra;

public interface CompraService {
    Compra FindCompraById(int id_compra);
    void CreateCompra(Compra compra);
    void UpdateCompra(Compra compra);
    void DeleteCompra(int id_compra);
}
