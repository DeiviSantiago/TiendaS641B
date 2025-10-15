import java.util.ArrayList;
import java.util.List;

public class Impresion extends Producto {
    private String color;
    // foto[]: Foto -> usamos List<Foto> llamada foto
    private List<Foto> foto;
    private String tipoPapel;
    private String tamano;

    public Impresion() {
        super();
        foto = new ArrayList<>();
    }

    public Impresion(int numero, String nombre, double precio, int stock,
                     String color, String tipoPapel, String tamano) {
        super(numero, nombre, precio, stock);
        this.color = color;
        this.tipoPapel = tipoPapel;
        this.tamano = tamano;
        this.foto = new ArrayList<>();
    }

    // getters y setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public List<Foto> getFoto() { return foto; }
    public void setFoto(List<Foto> foto) { this.foto = foto; }

    public String getTipoPapel() { return tipoPapel; }
    public void setTipoPapel(String tipoPapel) { this.tipoPapel = tipoPapel; }

    public String getTamano() { return tamano; }
    public void setTamano(String tamano) { this.tamano = tamano; }

    // Métodos requeridos
    public void agregarFoto(Foto f) {
        if (f != null) foto.add(f);
    }

    public void imprimir() {
        System.out.println("Imprimiendo " + foto.size() + " fotos en papel " + tipoPapel + " (" + tamano + ")");
    }

    public double calcularCostoImpresion() {
        // costo base: precio + 2.0 por foto (ejemplo sencillo)
        double costo = getPrecio();
        costo += 2.0 * foto.size();
        if ("color".equalsIgnoreCase(color)) costo += 1.5 * foto.size();
        return costo;
    }

    @Override
    public double calcularPrecio() {
        return calcularCostoImpresion();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Impresion - Nombre: " + getNombre() + ", Numero: " + getNumero());
        System.out.println(" Color: " + color + ", Papel: " + tipoPapel + ", Tamano: " + tamano);
        System.out.println(" Fotos incluidas: " + foto.size());
    }
}
