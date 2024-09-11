package com.tiendaelectrica.historialventas.application;

import com.tiendaelectrica.historialventas.domain.entity.HistorialVentas;
import com.tiendaelectrica.historialventas.domain.service.HistorialVentasService;

public class CreateHistorialVentasUseCase {
    private final HistorialVentasService historialVentasService;

    public CreateHistorialVentasUseCase(HistorialVentasService historialVentasService) {
        this.historialVentasService = historialVentasService;
    }

    public void execute(HistorialVentas historialVentas) {
        historialVentasService.FindAllHistorial();
    }
}
