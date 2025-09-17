import java.util.HashMap;
import java.util.Scanner;

public class Inventario {
    HashMap<String, Producto> productos;



    public void imprimir() {
      for (Producto producto : productos.values()) {
          System.out.printf("%s: %s\n", producto.getCodigo(), producto.toString());
      }

    }
    public void agregarProducto() {

        Producto productoNuevo = new Producto();
        Scanner sc = new Scanner(System.in);

    }

    public void agregarStock(String codigo) {
        Scanner sc = new Scanner(System.in);
        Producto productoStock = productos.get(codigo);
        int cantidadActualStock = productoStock.getStock();
        System.out.print("Cantidad de stock a sumar: ");
        int cantidadSumar = sc.nextInt();
        productoStock.setStock(cantidadActualStock + cantidadSumar);
        System.out.printf("Stock agregado: %s\n", productoStock.getCodigo());
        sc.close();
    }

    public void restarStock(String codigo) {
        Scanner sc = new Scanner(System.in);
        Producto productoStock = productos.get(codigo);
        int cantidadActualStock = productoStock.getStock();
        System.out.print("Cantidad de stock a restar: ");
        int cantidadRestar = sc.nextInt();
        productoStock.setStock(cantidadActualStock - cantidadRestar);
        System.out.printf("Stock restado: %s\n", productoStock.getCodigo());
        sc.close();
    }

    public void vender(String codigo ,int cantidadVendida) {
        Scanner sc = new Scanner(System.in);
        Producto productoStock = productos.get(codigo);
        int cantidadActualStock = productoStock.getStock();

        productoStock.setStock(cantidadActualStock - cantidadVendida);
        Double total = cantidadVendida*productoStock.getPrecio();
        System.out.printf("Se han vendido %s de %s por %f ", cantidadActualStock,productoStock.getNombre() ,total );
        sc.close();


    }

    public void agregarProducto(String id,Producto producto ) {
        productos.put(id,producto);
    }



}
