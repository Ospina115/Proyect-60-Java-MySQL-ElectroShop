package com.tiendaelectrica.cruds.pedido.application;

import com.tiendaelectrica.cruds.pedido.domain.entity.Pedido;
import com.tiendaelectrica.cruds.pedido.domain.service.PedidoService;

public class CreatePedidoUseCase {
    private final PedidoService pedidoService;

    public CreatePedidoUseCase(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void execute(Pedido pedido) {
        pedidoService.CreatePedido(pedido);
    }
}
