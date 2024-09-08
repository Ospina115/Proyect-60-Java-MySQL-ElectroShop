package com.tiendaelectrica.cruds.compras;

public class DetallesCompra {
    private int idDetallesCompra;
    private String nombreDetallesCompra;
    private String detallesDetallesCompra;
    private int cantidadDetallesCompra;
    private int precioUnidadDetallesCompra;
    
    public DetallesCompra(String nombreDetallesCompra, String detallesDetallesCompra, int cantidadDetallesCompra,
            int precioUnidadDetallesCompra) {
        this.nombreDetallesCompra = nombreDetallesCompra;
        this.detallesDetallesCompra = detallesDetallesCompra;
        this.cantidadDetallesCompra = cantidadDetallesCompra;
        this.precioUnidadDetallesCompra = precioUnidadDetallesCompra;
    }

    public int getIdDetallesCompra() {
        return idDetallesCompra;
    }

    public void setIdDetallesCompra(int idDetallesCompra) {
        this.idDetallesCompra = idDetallesCompra;
    }

    public String getNombreDetallesCompra() {
        return nombreDetallesCompra;
    }

    public void setNombreDetallesCompra(String nombreDetallesCompra) {
        this.nombreDetallesCompra = nombreDetallesCompra;
    }

    public String getDetallesDetallesCompra() {
        return detallesDetallesCompra;
    }

    public void setDetallesDetallesCompra(String detallesDetallesCompra) {
        this.detallesDetallesCompra = detallesDetallesCompra;
    }

    public int getCantidadDetallesCompra() {
        return cantidadDetallesCompra;
    }

    public void setCantidadDetallesCompra(int cantidadDetallesCompra) {
        this.cantidadDetallesCompra = cantidadDetallesCompra;
    }

    public int getPrecioUnidadDetallesCompra() {
        return precioUnidadDetallesCompra;
    }

    public void setPrecioUnidadDetallesCompra(int precioUnidadDetallesCompra) {
        this.precioUnidadDetallesCompra = precioUnidadDetallesCompra;
    }

    
}
