public class Producto {

    private String nombre;
    private  String codigo;
    private Double precio;
    private Categoria categoria;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, String codigo, Double precio, Categoria categoria, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
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
        return
                "Nombre : " + nombre + '\n'+
                "Codigo : " + codigo +'\n'+
                "Precio : " + precio +"€\n"+
                "Categoria : " + categoria +'\n'+
                "Stock : " + stock ;
    }
}
