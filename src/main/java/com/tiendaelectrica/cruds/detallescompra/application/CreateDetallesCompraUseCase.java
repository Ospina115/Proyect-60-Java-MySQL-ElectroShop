package com.tiendaelectrica.cruds.detallescompra.application;

import com.tiendaelectrica.cruds.detallescompra.domain.entity.DetallesCompra;
import com.tiendaelectrica.cruds.detallescompra.domain.service.DetallesCompraService;

public class CreateDetallesCompraUseCase {
    private DetallesCompraService detallesCompraService;

    public CreateDetallesCompraUseCase(DetallesCompraService detallesCompraService) {
        this.detallesCompraService = detallesCompraService;
    }

    public void execute(DetallesCompra detallesCompra) {
        detallesCompraService.addDetallesCompra(detallesCompra);
    }
}
