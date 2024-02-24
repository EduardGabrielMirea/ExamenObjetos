package libros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Autor> autors = new ArrayList<>();

        Tema t1 = new Tema("Aventura");
        Tema t2 = new Tema("Accion");
        Tema t3 = new Tema("Documental");
        Tema t4 = new Tema("Drama");

        Autor a1 = new Autor("Eddy","09/07/2000");
            Libro l1 = new Libro("Gran Muralla",120,a1);
            Libro l2 = new Libro("La Conquista",300,a1);
            Libro l3 = new Libro("Rumania",200,a1);
            a1.addLibros(l1);
            a1.addLibros(l2);
            a1.addLibros(l3);
                l1.addTema(t1);
                l2.addTema(t2);
                l3.addTema(t3);

        Autor a2 = new Autor("Juan", "20/08/2000");
            Libro l4 = new Libro("Xina",100,a2);
            a2.addLibros(l4);
                l4.addTema(t3);

        Autor a3 = new Autor("Pepe", "02/10/2000");
            Libro l5 = new Libro("El Caminar",425,a3);
            Libro l6 = new Libro("La Noche",100,a3);
            a3.addLibros(l5);
            a3.addLibros(l6);
                l5.addTema(t4);
                l6.addTema(t4);

        autors.add(a1);
        autors.add(a2);
        autors.add(a3);

        for (Autor a : autors){
            System.out.println("\n"+a);
            for (Libro l : a.getLibros()){
                System.out.println("\t"+l);
                for (Tema t : l.getTemas()){
                    System.out.println("\t\t"+t);
                }
            }
        }

    }
}
