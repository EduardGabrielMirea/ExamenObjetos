package libros;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nombre;
    private String fechaNacimiento;
    private Set<Libro> libros;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    public void addLibros(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString(){
        return "El nombre del autor: "+this.nombre+"\n"+"La fecha de nacimiento: "+this.fechaNacimiento;
    }
}
