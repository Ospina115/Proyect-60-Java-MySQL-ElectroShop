package com.tiendaelectrica.cruds.detallesventas.application;

import com.tiendaelectrica.cruds.detallesventas.domain.entity.DetallesVentas;
import com.tiendaelectrica.cruds.detallesventas.domain.service.DetallesVentasService;

public class CreateDetallesVentasUseCase {
    private DetallesVentasService detallesVentasService;

    public CreateDetallesVentasUseCase(DetallesVentasService detallesVentasService) {
        this.detallesVentasService = detallesVentasService;
    }

    public void execute(DetallesVentas detallesVentas) {
        detallesVentasService.addDetallesVentas(detallesVentas);
    }
}
