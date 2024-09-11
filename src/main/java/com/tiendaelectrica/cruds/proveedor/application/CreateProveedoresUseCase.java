package com.tiendaelectrica.cruds.proveedor.application;

import com.tiendaelectrica.cruds.proveedor.domain.entity.Proveedores;
import com.tiendaelectrica.cruds.proveedor.domain.service.ProveedoresService;

public class CreateProveedoresUseCase {
    private final ProveedoresService proveedoresService;

    public CreateProveedoresUseCase(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    public void execute(Proveedores proveedores) {
        proveedoresService.CreateProveedores(proveedores);
    }
}
