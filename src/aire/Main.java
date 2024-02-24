package aire;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aire> aires = new ArrayList<>();

        Aire a1 = new Aire("LG",40,0,2);
        Aire a2 = new Aire("SAMSUNG",40,0,38);

        aires.add(a1);
        aires.add(a2);

        for (Aire x : aires){
            System.out.println(x);
        }

    try {
        a1.bajar();
        a1.bajar();
        a1.bajar();

        a2.subir();
        a2.subir();
        a2.subir();
    }catch (IllegalArgumentException e){
        System.out.println("Error de accion en la temperatura: "+ e.getMessage());
    }

    for (Aire x: aires){
            System.out.println(x);
        }

    }
}
