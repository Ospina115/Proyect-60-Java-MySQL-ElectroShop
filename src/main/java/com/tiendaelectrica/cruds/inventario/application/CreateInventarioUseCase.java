package com.tiendaelectrica.cruds.inventario.application;

import com.tiendaelectrica.cruds.inventario.domain.entity.Inventario;
import com.tiendaelectrica.cruds.inventario.domain.service.InventarioService;

public class CreateInventarioUseCase {
    private final InventarioService inventarioService;

    public CreateInventarioUseCase(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    public void execute(Inventario inventario) {
        inventarioService.createInventario(inventario);
    }
}
