import java.util.Date;

public class Foto {
    private int id;
    private String resolucion;
    private String formato;
    private double tamano;
    private Date fechaCaptura;

    public Foto() {}

    public Foto(int id, String resolucion, String formato, double tamano, Date fechaCaptura) {
        this.id = id;
        this.resolucion = resolucion;
        this.formato = formato;
        this.tamano = tamano;
        this.fechaCaptura = fechaCaptura;
    }

    // getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getResolucion() { return resolucion; }
    public void setResolucion(String resolucion) { this.resolucion = resolucion; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }

    public Date getFechaCaptura() { return fechaCaptura; }
    public void setFechaCaptura(Date fechaCaptura) { this.fechaCaptura = fechaCaptura; }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.println("Foto ID: " + id + ", Resolucion: " + resolucion + ", Formato: " + formato + ", Tamano: " + tamano + "MB, Fecha: " + fechaCaptura);
    }

    public void editar(int brillo, int contraste) {
        // ejemplo simple: solo mostramos que se editó
        System.out.println("Editando foto " + id + " -> brillo: " + brillo + ", contraste: " + contraste);
    }

    public void guardar(String ruta) {
        System.out.println("Guardando foto " + id + " en: " + ruta);
    }
}
