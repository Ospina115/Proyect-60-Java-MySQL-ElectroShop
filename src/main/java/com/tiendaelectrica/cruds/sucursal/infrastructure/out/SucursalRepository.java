package com.tiendaelectrica.cruds.sucursal.infrastructure.out;

import com.tiendaelectrica.cruds.sucursal.domain.entity.Sucursal;
import com.tiendaelectrica.cruds.sucursal.domain.service.SucursalService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SucursalRepository implements SucursalService {

    private Connection getConnection() throws Exception {
        return com.tiendaelectrica.infraestructure.DatabaseConfig.getConnection();
    }

    @Override
    public void addSucursal(Sucursal sucursal) {
        try (Connection connection = getConnection()) {
            String sql = "INSERT INTO sucursal (nombre, direccion, telefono, id_ciudad, id_producto) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, sucursal.getNombre());
            stmt.setString(2, sucursal.getDireccion());
            stmt.setString(3, sucursal.getTelefono());
            stmt.setInt(4, sucursal.getId_ciudad());
            stmt.setInt(5, sucursal.getId_producto());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Sucursal findSucursalById(int id_sucursal) {
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM sucursal WHERE id_sucursal = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id_sucursal);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Sucursal(
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getInt("id_ciudad"),
                        rs.getInt("id_producto")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateSucursal(Sucursal sucursal) {
        try (Connection connection = getConnection()) {
            String sql = "UPDATE sucursal SET nombre = ?, direccion = ?, telefono = ?, id_ciudad = ?, id_producto = ? WHERE id_sucursal = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, sucursal.getNombre());
            stmt.setString(2, sucursal.getDireccion());
            stmt.setString(3, sucursal.getTelefono());
            stmt.setInt(4, sucursal.getId_ciudad());
            stmt.setInt(5, sucursal.getId_producto());
            stmt.setInt(6, sucursal.getId_sucursal());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteSucursal(int id_sucursal) {
        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM sucursal WHERE id_sucursal = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id_sucursal);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
