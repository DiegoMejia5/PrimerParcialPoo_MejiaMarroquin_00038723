class TelefonoMovil extends ArticuloElectronicoAbstracto {
    public TelefonoMovil(String nombre, String modelo, String descripcion, double precio) {
        super(nombre, modelo, descripcion, precio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Telefono movil - Nombre: " + nombre + ", Modelo: " + modelo + ", Descripcion: " + descripcion + ", Precio: $" + precio);
    }
}
class Laptop extends ArticuloElectronicoAbstracto {
    public Laptop(String nombre, String modelo, String descripcion, double precio) {
        super(nombre, modelo, descripcion, precio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop - Nombre: " + nombre + ", Modelo: " + modelo + ", Descripcion: " + descripcion + ", Precio: $" + precio);
    }
}