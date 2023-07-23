public class Electronico extends Producto {
    private String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public double calcularDescuento() {
        // Aplicamos un descuento del 10% para productos electrónicos
        return getPrecio() * 0.9;
    }
}