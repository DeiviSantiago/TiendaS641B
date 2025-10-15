import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    // en UML: producto[]: Producto -> lo representamos con List
    private List<Producto> producto;
    private Date fecha;
    private String numeroTarjetaCredito;
    private double total;

    private Pedido() {
        producto = new ArrayList<>();
        fecha = new Date();
    }

    // Builder estático
    public static class Builder {
        private Cliente cliente;
        private List<Producto> producto = new ArrayList<>();
        private Date fecha;
        private String numeroTarjetaCredito;

        public Builder() {
            this.fecha = new Date();
        }

        public Builder cliente(Cliente c) {
            this.cliente = c;
            return this;
        }

        public Builder agregarProducto(Producto p) {
            if (p != null) {
                this.producto.add(p);
            }
            return this;
        }

        public Builder fecha(Date f) {
            this.fecha = f;
            return this;
        }

        public Builder numeroTarjetaCredito(String num) {
            this.numeroTarjetaCredito = num;
            return this;
        }

        public Pedido build() {
            Pedido ped = new Pedido();
            ped.cliente = this.cliente;
            ped.producto = this.producto;
            ped.fecha = this.fecha;
            ped.numeroTarjetaCredito = this.numeroTarjetaCredito;
            ped.total = ped.calcularTotal();
            if (ped.cliente != null) {
                ped.cliente.registrarPedido(ped);
            }
            return ped;
        }
    }

    // getters y setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Producto> getProducto() { return producto; }
    public void setProducto(List<Producto> producto) { this.producto = producto; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getNumeroTarjetaCredito() { return numeroTarjetaCredito; }
    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) { this.numeroTarjetaCredito = numeroTarjetaCredito; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    // Métodos requeridos
    // agregarProducto: añade producto y actualiza total
    public void agregarProducto(Producto p) {
        if (p != null) {
            producto.add(p);
            this.total = calcularTotal();
        }
    }

    public double calcularTotal() {
        double suma = 0;
        for (Producto p : producto) {
            if (p != null) {
                suma += p.calcularPrecio();
            }
        }
        this.total = suma;
        return suma;
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + (cliente != null ? cliente.getNombre() : "N/A"));
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        if (producto.isEmpty()) {
            System.out.println("  No hay productos.");
        } else {
            for (Producto p : producto) {
                p.mostrarInfo();
                System.out.println("  Precio calculado: " + p.calcularPrecio());
                System.out.println("  ----------");
            }
        }
        System.out.println("Total del pedido: " + calcularTotal());
        System.out.println("Tarjeta: " + (numeroTarjetaCredito != null ? numeroTarjetaCredito : "N/A"));
    }
}
