import java.util.ArrayList;

public class Impresion extends Producto {
    private String color;
    private String tipoPapel;
    private String tamano;
    private ArrayList<Foto> fotos;

    public Impresion(int numero, String nombre, double precio, int stock, String color, String tipoPapel, String tamano) {
        super(numero, nombre, precio, stock);
        this.color = color;
        this.tipoPapel = tipoPapel;
        this.tamano = tamano;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto f) {
        fotos.add(f);
    }

    public void imprimir() {
        System.out.println("Imprimiendo " + fotos.size() + " fotos en papel " + tipoPapel + " tamaño " + tamano);
    }

    public double calcularCostoImpresion() {
        return fotos.size() * precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Impresión: " + nombre + " | Color: " + color + " | Precio base: $" + precio);
    }
}
