import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private String numeroTarjetaCredito;
    private double total;

    public Pedido(Cliente cliente, String numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.total = 0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecio();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("\nPedido del cliente: " + cliente.getNombre());
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}