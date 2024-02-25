package tiendainformatica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ordenador> ordenadores = new ArrayList<>();
        Ordenador o1 = new Ordenador("Acer","RTX10");
        Ordenador o2 = new Ordenador("Apple","IO20");
        Ordenador o3 = new Ordenador("Asus","FORCEx");

        o1.setCodigo(127027);
        o1.setCapacidadGb(1000);

        o2.setCodigo(128028);
        o2.setCapacidadGb(2000);

        o3.setCodigo(129029);
        o3.setCapacidadGb(2000);

        ordenadores.add(o1);
        ordenadores.add(o2);
        ordenadores.add(o3);

        for (Ordenador o : ordenadores){
            System.out.println("\n"+o);
        }
    }
}
