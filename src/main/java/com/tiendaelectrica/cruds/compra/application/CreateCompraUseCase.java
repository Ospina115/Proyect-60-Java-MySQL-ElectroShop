package com.tiendaelectrica.cruds.compra.application;

import com.tiendaelectrica.cruds.compra.domain.entity.Compra;
import com.tiendaelectrica.cruds.compra.domain.service.CompraService;

public class CreateCompraUseCase {
    private final CompraService compraService;

    public CreateCompraUseCase(CompraService compraService) {
        this.compraService = compraService;
    }

    public void execute(Compra compra) {
        compraService.CreateCompra(compra);
    }
}
