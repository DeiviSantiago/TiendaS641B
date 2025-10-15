public abstract class Producto {
    protected int numero;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(int numero, String nombre, double precio, int stock) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double calcularPrecio() {
        return precio;
    }

    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}