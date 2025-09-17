public enum Categoria {
    ELECTRONICA("Electrónica"),
    ROPA("Ropa"),
    ALIMENTACION("Alimentación"),
    HOGAR("Hogar"),
    LIBROS("Libros"),
    JUGUETES("Juguetes"),
    DEPORTE("Deporte"),
    SALUD("Salud"),
    OTROS("Otros");

    private final String nombre;

    Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
