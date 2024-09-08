package com.tiendaelectrica.cruds.compras;

import java.sql.*;
import javax.swing.JOptionPane;
import com.tiendaelectrica.infraestructure.DatabaseConfig;

public class CompraDAO {

    // Crear una nueva compra
    public void agregarCompra() {
        int idProveedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del proveedor:"));
        String fechaCompra = JOptionPane.showInputDialog("Ingrese la fecha de la compra (YYYY-MM-DD):");
        int precioCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio total de la compra:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "INSERT INTO compra (id_proveedor, fecha_compra, precio_compra) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idProveedor);
            ps.setDate(2, Date.valueOf(fechaCompra));
            ps.setInt(3, precioCompra);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra agregada exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la compra: " + e.getMessage());
        }
    }

    // Leer compra por ID
    public void obtenerCompra() {
        int idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "SELECT * FROM compra WHERE id_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCompra);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idProveedor = rs.getInt("id_proveedor");
                Date fechaCompra = rs.getDate("fecha_compra");
                int precioCompra = rs.getInt("precio_compra");

                JOptionPane.showMessageDialog(null, "Compra ID: " + idCompra + "\nID Proveedor: " + idProveedor + "\nFecha Compra: " + fechaCompra + "\nPrecio Total: " + precioCompra);
            } else {
                JOptionPane.showMessageDialog(null, "Compra no encontrada.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la compra: " + e.getMessage());
        }
    }

    // Actualizar compra
    public void actualizarCompra() {
        int idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra a actualizar:"));

        int idProveedor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del proveedor:"));
        String fechaCompra = JOptionPane.showInputDialog("Ingrese la nueva fecha de la compra (YYYY-MM-DD):");
        int precioCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio total de la compra:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "UPDATE compra SET id_proveedor = ?, fecha_compra = ?, precio_compra = ? WHERE id_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idProveedor);
            ps.setDate(2, Date.valueOf(fechaCompra));
            ps.setInt(3, precioCompra);
            ps.setInt(4, idCompra);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra actualizada exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la compra: " + e.getMessage());
        }
    }

    // Eliminar compra
    public void eliminarCompra() {
        int idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra a eliminar:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "DELETE FROM compra WHERE id_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCompra);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra eliminada exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la compra: " + e.getMessage());
        }
    }
}
