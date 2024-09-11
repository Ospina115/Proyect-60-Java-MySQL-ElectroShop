package com.tiendaelectrica.pedidospendientes.application;

import com.tiendaelectrica.pedidospendientes.domain.entity.PedidosPendientes;
import com.tiendaelectrica.pedidospendientes.domain.service.PedidosPendientesService;

public class CreatePedidosPendientesUseCase {
    private final PedidosPendientesService pedidosPendientesService;
         // Constructor que recibe el servicio de pedidos pendientes
    public CreatePedidosPendientesUseCase(PedidosPendientesService pedidosPendientesService) {
        this.pedidosPendientesService = pedidosPendientesService;
    }

        // Ejecuta la creación de un nuevo  pedidopendientes
    public void execute(PedidosPendientes pedidosPendientes) {
        pedidosPendientesService.findAllPedidosPendientes();
    }
}