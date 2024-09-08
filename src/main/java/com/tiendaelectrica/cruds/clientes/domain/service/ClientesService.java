package main.java.com.tiendaelectrica.cruds.clientes.domain.service;

import main.java.com.tiendaelectrica.cruds.clientes.domain.entity.Clientes;

public interface ClientesService {
    Clientes FindClientesById(int id);
    void CreateClientes(Clientes clientes);
    void UpdateClientes(Clientes clientes);
    void DeleteClientes(int id);
}
