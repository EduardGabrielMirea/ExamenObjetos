package tiendainformatica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ordenadores> ordenadores = new ArrayList<>();
        Ordenadores o1 = new Ordenadores("Acer","RTX10");
        Ordenadores o2 = new Ordenadores("Apple","IO20");
        Ordenadores o3 = new Ordenadores("Asus","FORCEx");

        o1.setCodigo(127027);
        o1.setCapacidadGb(1000);

        o2.setCodigo(128028);
        o2.setCapacidadGb(2000);

        o3.setCodigo(129029);
        o3.setCapacidadGb(2000);

        ordenadores.add(o1);
        ordenadores.add(o2);
        ordenadores.add(o3);

        for (Ordenadores o : ordenadores){
            System.out.println("\n"+o);
        }
    }
}
