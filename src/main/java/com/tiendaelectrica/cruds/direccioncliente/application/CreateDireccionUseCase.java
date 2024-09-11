package com.tiendaelectrica.cruds.direccioncliente.application;

import com.tiendaelectrica.cruds.direccioncliente.domain.entity.Direccion;
import com.tiendaelectrica.cruds.direccioncliente.domain.service.DireccionService;

public class CreateDireccionUseCase {
    private final DireccionService direccionService;

    public CreateDireccionUseCase(DireccionService direccionService) {
        this.direccionService = direccionService;
    }

    public void execute(Direccion direccion) {
        direccionService.CreateDireccion(direccion);
    }
}
