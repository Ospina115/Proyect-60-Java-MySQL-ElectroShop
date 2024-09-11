package com.tiendaelectrica.cruds.detallespedidos.application;

import com.tiendaelectrica.cruds.detallespedidos.domain.entity.DetallesPedidos;
import com.tiendaelectrica.cruds.detallespedidos.domain.service.DetallesPedidosService;

public class CreateDetallesPedidosUseCase {
    private DetallesPedidosService detallesPedidosService;

    public CreateDetallesPedidosUseCase(DetallesPedidosService detallesPedidosService) {
        this.detallesPedidosService = detallesPedidosService;
    }

    public void execute(DetallesPedidos detallesPedidos) {
        detallesPedidosService.addDetallesPedidos(detallesPedidos);
    }
}
