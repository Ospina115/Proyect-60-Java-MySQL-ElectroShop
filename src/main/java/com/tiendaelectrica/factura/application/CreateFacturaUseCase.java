package com.tiendaelectrica.factura.application;

import com.tiendaelectrica.factura.domain.entity.Factura;
import com.tiendaelectrica.factura.domain.service.FacturaService;

public class CreateFacturaUseCase {
    private final FacturaService facturaService;

    public CreateFacturaUseCase(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    public void execute(Factura factura) {
        facturaService.FindFacturaById(0);
    }
}
