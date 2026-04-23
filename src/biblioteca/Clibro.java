package biblioteca;

public class CLibro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public CLibro() {
    }

    public CLibro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public boolean prestar(int cantidad) {
        if ((getPrestados() + cantidad) <= getEjemplares()) {
            prestados = getPrestados() + cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver(int cantidad) {
        if ((getPrestados() - cantidad) >= 0) {
            prestados = getPrestados() - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ejemplares: " + getEjemplares());
        System.out.println("Prestados: " + getPrestados());
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @return the prestados
     */
    public int getPrestados() {
        return prestados;
    }
}