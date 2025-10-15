import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de Cliente ===");
        System.out.print("Cedula: ");
        String ced = sc.nextLine();
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Direccion: ");
        String dir = sc.nextLine();
        System.out.print("Telefono: ");
        String tel = sc.nextLine();
        System.out.print("Correo: ");
        String cor = sc.nextLine();

        Cliente cliente = new Cliente(ced, nom, dir, tel, cor);

        System.out.println("\n=== Crear Pedido ===");
        System.out.print("Numero de tarjeta (simulado): ");
        String tarjeta = sc.nextLine();

        // Usamos Builder para crear el pedido
        Pedido.Builder builder = new Pedido.Builder().cliente(cliente).numeroTarjetaCredito(tarjeta).fecha(new Date());

        boolean agregarMas = true;
        while (agregarMas) {
            System.out.println("\nAgregar producto: 1) Camara  2) Impresion  0) Terminar");
            System.out.print("Opcion: ");
            String op = sc.nextLine();
            if (op.equals("1")) {
                // Datos camara
                System.out.print("Numero (int): ");
                int num = Integer.parseInt(sc.nextLine());
                System.out.print("Nombre: ");
                String nombreP = sc.nextLine();
                System.out.print("Precio (double): ");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.print("Stock (int): ");
                int stock = Integer.parseInt(sc.nextLine());
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Resolucion (MP) ejemplo 12.0: ");
                double res = Double.parseDouble(sc.nextLine());
                System.out.print("Tipo (ej: basica, semi, profesional): ");
                String tipo = sc.nextLine();

                Camara cam = new Camara(num, nombreP, precio, stock, marca, modelo, res, tipo);
                builder.agregarProducto(cam);
                System.out.println("Camara agregada.");

            } else if (op.equals("2")) {
                // Datos impresion
                System.out.print("Numero (int): ");
                int num = Integer.parseInt(sc.nextLine());
                System.out.print("Nombre: ");
                String nombreP = sc.nextLine();
                System.out.print("Precio base (double): ");
                double precio = Double.parseDouble(sc.nextLine());
                System.out.print("Stock (int): ");
                int stock = Integer.parseInt(sc.nextLine());
                System.out.print("Color (color/bn): ");
                String color = sc.nextLine();
                System.out.print("Tipo de papel: ");
                String papel = sc.nextLine();
                System.out.print("Tamano (ej A4): ");
                String tam = sc.nextLine();

                Impresion imp = new Impresion(num, nombreP, precio, stock, color, papel, tam);

                System.out.print("Cuantas fotos agregar a la impresion? ");
                int cantFotos = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < cantFotos; i++) {
                    Foto f = new Foto();
                    f.setId((int)(Math.random() * 10000));
                    f.setResolucion("12MP");
                    f.setFormato("jpg");
                    f.setTamano(2.0);
                    f.setFechaCaptura(new Date());
                    imp.agregarFoto(f);
                }

                builder.agregarProducto(imp);
                System.out.println("Impresion agregada.");

            } else if (op.equals("0")) {
                agregarMas = false;
            } else {
                System.out.println("Opcion no valida.");
            }
        }

        // Construir pedido con Builder
        Pedido pedido = builder.build();

        System.out.println("\n=== Resumen del Pedido ===");
        pedido.mostrarDetalle();

        System.out.println("\n=== Consultando pedidos del cliente ===");
        cliente.consultarPedidos();

        sc.close();
    }
}
