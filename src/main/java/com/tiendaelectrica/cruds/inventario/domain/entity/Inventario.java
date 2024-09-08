package com.tiendaelectrica.cruds.inventario.domain.entity;

import java.sql.Date;

public class Inventario {
    
    private int id;
    private int cantidad;
    private Date fecha_ingreso;
    private Date fecha_actualizacion;
    
    public Inventario(int cantidad, Date fecha_ingreso, Date fecha_actualizacion) {
        this.cantidad = cantidad;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    
}
