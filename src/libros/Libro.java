package libros;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String titulo;
    private int paginas;
    private Autor autors;
    private Set<Tema> temas;

    public Libro(String titulo, int paginas, Autor autors) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autors = autors;
        this.temas = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Autor getAutors() {
        return autors;
    }

    public void setAutors(Autor autors) {
        this.autors = autors;
    }

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }

    public void addTema(Tema tema){
        this.temas.add(tema);
    }

    @Override
    public String toString(){
        return "El título del libro es --> " +this.titulo+", el libro tiene "+this.paginas+" páginas.";
    }
}
