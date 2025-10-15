import java.util.Date;

public class Camara extends Producto {
    private String marca;
    private String modelo;
    private double resolucion;
    private String tipo;

    public Camara() {
        super();
    }

    public Camara(int numero, String nombre, double precio, int stock,
                  String marca, String modelo, double resolucion, String tipo) {
        super(numero, nombre, precio, stock);
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    // getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getResolucion() { return resolucion; }
    public void setResolucion(double resolucion) { this.resolucion = resolucion; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    // Métodos requeridos
    public Foto tomarFoto() {
        // creamos una foto demo con datos básicos
        Foto f = new Foto();
        f.setId((int)(Math.random() * 10000));
        f.setResolucion(this.resolucion + "MP");
        f.setFormato("jpg");
        f.setTamano(2.5);
        f.setFechaCaptura(new Date());
        return f;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Camara - Marca: " + marca + ", Modelo: " + modelo + ", Resolucion: " + resolucion + " MP, Tipo: " + tipo);
    }

    public int calcularGarantia() {
        // simple: garantía en meses según tipo
        if ("profesional".equalsIgnoreCase(tipo)) return 36;
        if ("semi".equalsIgnoreCase(tipo)) return 24;
        return 12;
    }

    @Override
    public double calcularPrecio() {
        // precio base, más un pequeño cargo por resolución
        double extra = resolucion * 0.5;
        return getPrecio() + extra;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Camara - Nombre: " + getNombre() + ", Numero: " + getNumero());
        mostrarCaracteristicas();
        System.out.println("Precio base: " + getPrecio());
    }
}
