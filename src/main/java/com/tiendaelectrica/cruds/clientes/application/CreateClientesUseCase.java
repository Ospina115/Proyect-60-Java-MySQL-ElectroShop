package com.tiendaelectrica.cruds.clientes.application;

import com.tiendaelectrica.cruds.clientes.domain.entity.Clientes;
import com.tiendaelectrica.cruds.clientes.domain.service.ClientesService;

public class CreateClientesUseCase {
    private final ClientesService clientesService;

    public CreateClientesUseCase(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    public void execute(Clientes clientes) {
        clientesService.CreateClientes(clientes);
    }
}
