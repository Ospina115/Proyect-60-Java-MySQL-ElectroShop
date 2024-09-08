package main.java.com.tiendaelectrica.cruds.clientes;

import java.sql.*;
import javax.swing.JOptionPane;
import com.tiendaelectrica.infraestructure.DatabaseConfig;;

public class ClienteDAO {

    // Crear un nuevo cliente
    public void agregarCliente() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String email = JOptionPane.showInputDialog("Ingrese el email del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        int idDireccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la dirección del cliente:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "INSERT INTO clientes (nombre_cliente, apellido_cliente, email_cliente, telefono_cliente, id_direccioncliente) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, email);
            ps.setString(4, telefono);
            ps.setInt(5, idDireccion);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente: " + e.getMessage());
        }
    }

    // Leer cliente por ID
    public void obtenerCliente() {
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "SELECT * FROM clientes WHERE id_cliente = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre_cliente");
                String apellido = rs.getString("apellido_cliente");
                String email = rs.getString("email_cliente");
                String telefono = rs.getString("telefono_cliente");
                int idDireccion = rs.getInt("id_direccioncliente");

                JOptionPane.showMessageDialog(null, "Cliente ID: " + idCliente + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEmail: " + email + "\nTeléfono: " + telefono + "\nID Dirección: " + idDireccion);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el cliente: " + e.getMessage());
        }
    }

    // Actualizar cliente
    public void actualizarCliente() {
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente a actualizar:"));

        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido del cliente:");
        String email = JOptionPane.showInputDialog("Ingrese el nuevo email del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el nuevo teléfono del cliente:");
        int idDireccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID de la dirección del cliente:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "UPDATE clientes SET nombre_cliente = ?, apellido_cliente = ?, email_cliente = ?, telefono_cliente = ?, id_direccioncliente = ? WHERE id_cliente = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, email);
            ps.setString(4, telefono);
            ps.setInt(5, idDireccion);
            ps.setInt(6, idCliente);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + e.getMessage());
        }
    }

    // Eliminar cliente
    public void eliminarCliente() {
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente a eliminar:"));

        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "DELETE FROM clientes WHERE id_cliente = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, idCliente);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage());
        }
    }
}
