package main.java.com.tiendaelectrica.cruds.compras;

import java.sql.*;
import javax.swing.JOptionPane;
import com.tiendaelectrica.infraestructure.DatabaseConfig;

public class DetallesCompraDAO {

    // Crear un nuevo detalle de compra
    public void agregarDetallesCompra() {
        int idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la compra:"));
        int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto:"));
        String nombreCompra = JOptionPane.showInputDialog("Ingrese el nombre de la compra:");
        String detalles = JOptionPane.showInputDialog("Ingrese los detalles de la compra:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad comprada:"));
        int precioUnidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por unidad:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "INSERT INTO detalles_compra (id_compra, id_producto, nombre_compra, detalles, cantidad, precio_unidad) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProducto);
            ps.setString(3, nombreCompra);
            ps.setString(4, detalles);
            ps.setInt(5, cantidad);
            ps.setInt(6, precioUnidad);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Detalles de compra agregados exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar los detalles de compra: " + e.getMessage());
        }
    }

    // Leer detalles de compra por ID
    public void obtenerDetallesCompra() {
        int idDetallesCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de los detalles de compra:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "SELECT * FROM detalles_compra WHERE id_detalles_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idDetallesCompra);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idCompra = rs.getInt("id_compra");
                int idProducto = rs.getInt("id_producto");
                String nombreCompra = rs.getString("nombre_compra");
                String detalles = rs.getString("detalles");
                int cantidad = rs.getInt("cantidad");
                int precioUnidad = rs.getInt("precio_unidad");

                JOptionPane.showMessageDialog(null, "ID Detalles Compra: " + idDetallesCompra + "\nID Compra: " + idCompra + "\nID Producto: " + idProducto + "\nNombre Compra: " + nombreCompra + "\nDetalles: " + detalles + "\nCantidad: " + cantidad + "\nPrecio Unidad: " + precioUnidad);
            } else {
                JOptionPane.showMessageDialog(null, "Detalles de compra no encontrados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los detalles de compra: " + e.getMessage());
        }
    }

    // Actualizar detalles de compra
    public void actualizarDetallesCompra() {
        int idDetallesCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de los detalles de compra a actualizar:"));

        int idCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID de la compra:"));
        int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del producto:"));
        String nombreCompra = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la compra:");
        String detalles = JOptionPane.showInputDialog("Ingrese los nuevos detalles de la compra:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad comprada:"));
        int precioUnidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio por unidad:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "UPDATE detalles_compra SET id_compra = ?, id_producto = ?, nombre_compra = ?, detalles = ?, cantidad = ?, precio_unidad = ? WHERE id_detalles_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCompra);
            ps.setInt(2, idProducto);
            ps.setString(3, nombreCompra);
            ps.setString(4, detalles);
            ps.setInt(5, cantidad);
            ps.setInt(6, precioUnidad);
            ps.setInt(7, idDetallesCompra);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Detalles de compra actualizados exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los detalles de compra: " + e.getMessage());
        }
    }

    // Eliminar detalles de compra
    public void eliminarDetallesCompra() {
        int idDetallesCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de los detalles de compra a eliminar:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "DELETE FROM detalles_compra WHERE id_detalles_compra = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idDetallesCompra);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Detalles de compra eliminados exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los detalles de compra: " + e.getMessage());
        }
    }
}

