package com.tiendaelectrica.cruds.categorias.infrastructure.out;

// impostaciones de las librerias de java que vamos a utilizar
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//importaciones de las variables que vamos a necesitar
import com.tiendaelectrica.cruds.categorias.domain.entity.Categoria;
import com.tiendaelectrica.cruds.categorias.domain.service.CategoriaService;
import com.tiendaelectrica.infraestructure.DatabaseConfig;

public class CategoriaRepository implements CategoriaService {

    // Este método inserta una nueva categoría en la base de datos usando una
    // consulta SQL preparada, tomando el nombre de la categoría del objeto
    // Categoria
    @Override
    public void CreateCategoria(Categoria categoria) {
        String sql = "INSERT INTO categorias (nombre_categoria) VALUES (?)";
        try (Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, categoria.getNombre_categoria());
            statement.executeUpdate(); // Ejecuta la consulta
        } catch (SQLException e) {
            e.printStackTrace();
            // Maneja la excepción de manera adecuada aquí.
        }
    }
}
