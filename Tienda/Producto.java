public abstract class Producto {
    private int numero;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {}

    public Producto(int numero, String nombre, double precio, int stock) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // getters y setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Métodos requeridos
    public abstract double calcularPrecio();
    // implementar actualización de stock común
    public void actualizarStock(int cantidad) {
        this.stock = this.stock - cantidad;
        if (this.stock < 0) this.stock = 0;
    }
    public abstract void mostrarInfo();
}
