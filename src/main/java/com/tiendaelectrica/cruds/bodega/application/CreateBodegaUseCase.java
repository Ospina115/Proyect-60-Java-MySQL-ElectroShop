package com.tiendaelectrica.cruds.bodega.application;

import com.tiendaelectrica.cruds.bodega.domain.entity.Bodega;
import com.tiendaelectrica.cruds.bodega.domain.service.BodegaService;

public class CreateBodegaUseCase {
    private BodegaService bodegaService;

    public CreateBodegaUseCase(BodegaService bodegaService) {
        this.bodegaService = bodegaService;
    }

    public void execute(Bodega bodega) {
        bodegaService.createBodega(bodega);
    }
}
