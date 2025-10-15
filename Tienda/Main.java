public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1010", "Santiago", "Calle 10", "3001234567", "santiago@mail.com");
        Camara camara = new Camara(1, "CamPro", 1200.0, 5, "Canon", "R6", 24.2, "Reflex");
        Foto foto1 = camara.tomarFoto();
        
        Impresion impresion = new Impresion(2, "Impresión Premium", 2000.0, 10, "Color", "Mate", "A4");
        impresion.agregarFoto(foto1);

        Pedido pedido1 = new Pedido(cliente1, "1234-5678-9999-0000");
        pedido1.agregarProducto(camara);
        pedido1.agregarProducto(impresion);
        cliente1.registrarPedido(pedido1);

        cliente1.consultarPedidos();
    }
}
