import java.util.HashMap;
import java.util.Scanner;

public class Invetario {
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
    }



}
