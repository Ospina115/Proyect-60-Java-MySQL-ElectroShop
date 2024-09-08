package com.tiendaelectrica.cruds.proveedores.domain.service;

import com.tiendaelectrica.cruds.proveedores.domain.entity.Proveedores;

public interface ProveedoresService {
    Proveedores FindProveedoresById(int id);
    void CreateProveedores(Proveedores proovedores);
    void UpdateProveedores(Proveedores proovedores);
    void DeleteProveedores(int id);
}
