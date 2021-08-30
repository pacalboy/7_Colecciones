public class Libro {
    private String titulo;
    private String autor;
    private int anoCompra;
    private float precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro {" + "Título: " + titulo + "\tAutor: " + autor +
                "\tAño de compra: " + anoCompra + "\tPrecio: " + precio + '}';
    }
   
}
