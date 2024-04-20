abstract class ArticuloElectronicoAbstracto implements ArticuloElectronico {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected double precio;

    public ArticuloElectronicoAbstracto(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
