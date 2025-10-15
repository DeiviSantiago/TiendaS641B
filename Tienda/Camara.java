public class Camara extends Producto {
    private String marca;
    private String modelo;
    private double resolucion;
    private String tipo;

    public Camara(int numero, String nombre, double precio, int stock, String marca, String modelo, double resolucion, String tipo) {
        super(numero, nombre, precio, stock);
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    public Foto tomarFoto() {
        System.out.println("Tomando foto con " + marca + " " + modelo);
        return new Foto(1, "1920x1080", "JPG", 2.5, new java.util.Date());
    }

    public void mostrarCaracteristicas() {
        System.out.println("Cámara " + marca + " " + modelo + " | " + resolucion + "MP | Tipo: " + tipo);
    }

    public int calcularGarantia() {
        return 12; // meses
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cámara: " + nombre + " | Marca: " + marca + " | Precio: $" + precio);
    }
}
