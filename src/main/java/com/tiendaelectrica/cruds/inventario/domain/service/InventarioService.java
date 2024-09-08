package com.tiendaelectrica.cruds.inventario.domain.service;

import java.security.Provider.Service;

public interface InventarioService {
    Service FindServiceById(int id);
    void CreateService(Service service);
    void UpdateService(Service service);
    void DeleteService(int id);
}
