package com.tiendaelectrica.cruds.compras;
import java.sql.Date;

public class Compra { 
    private int idCompra;
    private Date fechaCompra;
    private int precioCompra;

    public Compra(Date fechaCompra, int precioCompra) {
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }

    // Getters y setters
    public int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }
    


    
}
