import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Producto p1 = new Producto("Camiseta", "101", 19.99, Categoria.ROPA, 50);
        Producto p2 = new Producto("Portátil", "102", 799.99, Categoria.ELECTRONICA, 10);
        Producto p3 = new Producto("Pan", "103", 1.20, Categoria.ALIMENTACION, 100);
        Producto p4 = new Producto("Sofá", "104", 299.99, Categoria.HOGAR, 5);
        Producto p5 = new Producto("Libro de Java", "105", 24.99, Categoria.LIBROS, 30);
        Producto p6 = new Producto("Muñeca", "106", 14.99, Categoria.JUGUETES, 40);
        Producto p7 = new Producto("Bicicleta", "107", 199.99, Categoria.DEPORTE, 8);
        Producto p8 = new Producto("Vitaminas", "108", 9.99, Categoria.SALUD, 60);
        Producto p9 = new Producto("Auriculares", "109", 29.99, Categoria.ELECTRONICA, 25);
        Producto p10 = new Producto("Zapatillas", "110", 49.99, Categoria.ROPA, 20);

        Inventario inventario = new Inventario();
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        inventario.agregarProducto(p10);

        System.out.print( inventario.cantidadTotalStock());
        System.out.println("\n");
        inventario.imprimir();
        inventario.vender("109",2);

        inventario.imprimir();



    }
}
