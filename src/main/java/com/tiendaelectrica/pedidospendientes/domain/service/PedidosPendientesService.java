package com.tiendaelectrica.pedidospendientes.domain.service;

import java.util.List;
import com.tiendaelectrica.pedidospendientes.domain.entity.PedidosPendientes;

public interface PedidosPendientesService {

    List<PedidosPendientes> findAllPedidosPendientes();
}