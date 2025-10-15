import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private List<Pedido> pedidos;

    public Cliente() {
        this.pedidos = new ArrayList<>();
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pedidos = new ArrayList<>();
    }

    // getters y setters
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public List<Pedido> getPedidos() { return pedidos; }
    public void setPedidos(List<Pedido> pedidos) { this.pedidos = pedidos; }

    // Métodos requeridos
    public void registrarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }

    public void consultarPedidos() {
        System.out.println("Pedidos de " + nombre + ":");
        if (pedidos.isEmpty()) {
            System.out.println("  No hay pedidos.");
        } else {
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println("  Pedido " + (i+1) + ":");
                pedidos.get(i).mostrarDetalle();
                System.out.println("-------------");
            }
        }
    }

    public void actualizarDatos(String nuevoNombre, String nuevaDireccion, String nuevoTelefono, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.direccion = nuevaDireccion;
        this.telefono = nuevoTelefono;
        this.correo = nuevoCorreo;
    }
}
