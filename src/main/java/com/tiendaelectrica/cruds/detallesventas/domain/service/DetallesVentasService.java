package com.tiendaelectrica.cruds.detallesventas.domain.service;

import com.tiendaelectrica.cruds.detallesventas.domain.entity.DetallesVentas;

public interface DetallesVentasService {
    void addDetallesVentas(DetallesVentas detallesVentas);
    DetallesVentas findDetallesVentasById(int id_detalle_venta);
    void updateDetallesVentas(DetallesVentas detallesVentas);
    void deleteDetallesVentas(int id_detalle_venta);
}
