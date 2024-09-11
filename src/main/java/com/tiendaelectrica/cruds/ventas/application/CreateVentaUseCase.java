package com.tiendaelectrica.cruds.ventas.application;

import com.tiendaelectrica.cruds.ventas.domain.entity.Venta;
import com.tiendaelectrica.cruds.ventas.domain.service.VentaService;

public class CreateVentaUseCase {
    private final VentaService ventaService;

    public CreateVentaUseCase(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    public void execute(Venta venta) {
        ventaService.createVenta(venta);
    }
}
