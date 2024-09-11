package com.tiendaelectrica.cruds.pais.infrastructure.out;

// impostaciones de las librerias de java que vamos a utilizar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tiendaelectrica.cruds.pais.domain.entity.Pais;
import com.tiendaelectrica.cruds.pais.domain.service.PaisService;
import com.tiendaelectrica.infraestructure.DatabaseConfig;

public class PaisRepository implements PaisService{

    @Override
    public void CreatePais(Pais pais) {
         String sql = "INSERT INTO pais (nombre) VALUES (?)";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, pais.getNombre());
            statement.executeUpdate(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
