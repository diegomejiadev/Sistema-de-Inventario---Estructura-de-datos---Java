package pe.edu.unmsm.software.eapisw.model;

public class Consumo implements Comparable<Consumo> {

    private int idConsumo;
    private int idVenta;
    private int idProducto;
    private int cantidad;
    private Double precioVenta;

    public Consumo() {
    }

    public Consumo(int idConsumo, int idVenta, int idProducto, int cantidad, Double precioVenta) {
        this.idConsumo = idConsumo;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Consumo{" + "idConsumo=" + idConsumo + ", idVenta=" + idVenta + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + '}';
    }

    @Override
    public int compareTo(Consumo o) {
        if (this.idConsumo > o.idConsumo) {
            return 1;
        } else if (this.idConsumo == o.idConsumo) {
            return 0;
        } else {
            return -1;
        }
    }

}
