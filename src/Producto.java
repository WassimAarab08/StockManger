public class Producto {

    private String nombre;
    private  int codigo;
    private Double precio;
    private Categoria categoria;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, int codigo, Double precio, Categoria categoria, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getValor() {
        return this.stock * this.precio ;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", stock=" + stock +
                '}';
    }
}
