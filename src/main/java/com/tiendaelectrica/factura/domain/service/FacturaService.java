package com.tiendaelectrica.factura.domain.service;

import com.tiendaelectrica.factura.domain.entity.Factura;

public interface FacturaService {
    Factura FindFacturaById(int id_detalle_venta);
}
