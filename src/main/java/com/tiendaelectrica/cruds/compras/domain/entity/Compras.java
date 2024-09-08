public class Compras {
    
    private string id;
    private Date fecha;
    private int precio;
    
    public Compras(Date fecha, int precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
