// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creamos algunos productos y una orden
        Producto producto1 = new Producto(1, "Teléfono", 799.99, 3);
        Electronico producto2 = new Electronico(2, "Cargador", 99.99, 1, "Samsung");
        Producto producto3 = new Producto(3, "Cartera", 50.00, 2);
        Orden orden = new Orden();

        // Agrega productos a la orden
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        // LESTHER IMANOL ZACARÍAS LÓPEZ
        // Muestra los detalles de la orden
        orden.mostrarDetalles();
    }
}