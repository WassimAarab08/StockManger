import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    HashMap<String, Producto> productos;


    public Inventario() {
        productos = new HashMap<>();
    }


    public void imprimir() {
      for (Producto producto : productos.values()) {
          System.out.printf("Codigo => %s\n%s\n", producto.getCodigo(), producto.toString());
          System.out.println();
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
        System.out.printf("Se han vendido %s de %s por %f€ ", cantidadActualStock,productoStock.getNombre() ,total );
        sc.close();
    }

    public void agregarProducto(Producto producto ) {
        productos.put(producto.getCodigo(),producto);
    }

    public List<Producto> getProductos(Categoria categoria) {
        List<Producto> productos2 = new ArrayList<>();
        for (Producto producto : productos.values()) {
            if (categoria.equals(producto.getCategoria())) {
                productos2.add(producto);
            }
        }
        return productos2;
    }

    public Double importeTotal(){
        Double total = 0.0;
        for (Producto producto : productos.values()) {
          total=  producto.getPrecio() * producto.getPrecio();

        }
        return total;
    }

    public Long cantidadTotalStock() {
        Long total = 0L;
        for (Producto producto : productos.values()) {
            total += producto.getStock();

        }
        return total;
    }


}
