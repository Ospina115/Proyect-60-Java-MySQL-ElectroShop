package com.tiendaelectrica.cruds.detallespedidos.domain.service;

import com.tiendaelectrica.cruds.detallespedidos.domain.entity.DetallesPedidos;

public interface DetallesPedidosService {
    void addDetallesPedidos(DetallesPedidos detallesPedidos);
    DetallesPedidos findDetallesPedidosById(int id_detalle_pedido);
    void updateDetallesPedidos(DetallesPedidos detallesPedidos);
    void deleteDetallesPedidos(int id_detalle_pedido);
}
