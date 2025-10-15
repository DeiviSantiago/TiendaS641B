import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private ArrayList<Pedido> pedidos;

public Cliente(String cedula, String nombre, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pedidos = new ArrayList<>();
}

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void consultarPedidos() {
        for (Pedido p : pedidos) {
            p.mostrarDetalle();
        }
    }

    public void actualizarDatos(String nuevoNombre, String nuevaDireccion, String nuevoTelefono, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.direccion = nuevaDireccion;
        this.telefono = nuevoTelefono;
        this.correo = nuevoCorreo;
    }

    public String getNombre() { return nombre; }
}