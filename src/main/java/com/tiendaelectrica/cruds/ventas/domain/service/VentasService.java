package com.tiendaelectrica.cruds.ventas.domain.service;

import java.security.Provider.Service;

public interface VentasService {
    Service FindServiceById(int id);
    void CreateService(Service service);
    void UpdateService(Service service);
    void DeleteService(int id);
}
