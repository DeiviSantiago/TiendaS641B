import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);

        System.out.println("=== REGISTRO DE CLIENTE ===");
        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Ingrese correo: ");
        String correo = sc.nextLine();

        Cliente cliente = new Cliente(cedula, nombre, direccion, telefono, correo);

        System.out.println("\n=== REGISTRO DE CÁMARA ===");
        System.out.print("Ingrese número del producto: ");
        int numCam = scNum.nextInt();
        scNum.nextLine();
        System.out.print("Ingrese nombre de la cámara: ");
        String nomCam = sc.nextLine();
        System.out.print("Ingrese precio de la cámara: ");
        double precioCam = scNum.nextDouble();
        System.out.print("Ingrese stock disponible: ");
        int stockCam = scNum.nextInt();
        scNum.nextLine();
        System.out.print("Ingrese marca: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ingrese resolución (en megapíxeles): ");
        double resolucion = scNum.nextDouble();
        scNum.nextLine();
        System.out.print("Ingrese tipo de cámara (Reflex, Digital, etc): ");
        String tipo = sc.nextLine();

        Camara camara = new Camara(numCam, nomCam, precioCam, stockCam, marca, modelo, resolucion, tipo);
        Foto foto = camara.tomarFoto(); // Genera una foto automáticamente

        System.out.println("\n=== REGISTRO DE IMPRESIÓN ===");
        System.out.print("Ingrese número del producto: ");
        int numImp = scNum.nextInt();
        scNum.nextLine();
        System.out.print("Ingrese nombre de la impresión: ");
        String nomImp = sc.nextLine();
        System.out.print("Ingrese precio por impresión: ");
        double precioImp = scNum.nextDouble();
        System.out.print("Ingrese stock disponible: ");
        int stockImp = scNum.nextInt();
        scNum.nextLine();
        System.out.print("Ingrese color (Color / Blanco y Negro): ");
        String color = sc.nextLine();
        System.out.print("Ingrese tipo de papel: ");
        String tipoPapel = sc.nextLine();
        System.out.print("Ingrese tamaño (A4, Carta, etc): ");
        String tamano = sc.nextLine();

        Impresion impresion = new Impresion(numImp, nomImp, precioImp, stockImp, color, tipoPapel, tamano);
        impresion.agregarFoto(foto);

        System.out.println("\n=== CREACIÓN DE PEDIDO ===");
        System.out.print("Ingrese número de tarjeta de crédito (****-****-****-****): ");
        String tarjeta = sc.nextLine();

        Pedido pedido = new Pedido(cliente, tarjeta);
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        cliente.registrarPedido(pedido);

        System.out.println("\n=== DETALLE DEL PEDIDO ===");
        cliente.consultarPedidos();

        sc.close();
        scNum.close();
    }
}
