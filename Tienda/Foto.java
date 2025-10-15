import java.util.Date;

public class Foto {
    private int id;
    private String resolucion;
    private String formato;
    private double tamano;
    private Date fechaCaptura;

    public Foto(int id, String resolucion, String formato, double tamano, Date fechaCaptura) {
        this.id = id;
        this.resolucion = resolucion;
        this.formato = formato;
        this.tamano = tamano;
        this.fechaCaptura = fechaCaptura;
    }

    public void mostrarInfo() {
        System.out.println("Foto ID: " + id + " | Resolución: " + resolucion + " | Formato: " + formato);
    }

    public void editar(int brillo, int contraste) {
        System.out.println("Editando foto con brillo " + brillo + " y contraste " + contraste);
    }

    public void guardar(String ruta) {
        System.out.println("Foto guardada en: " + ruta);
    }
}
