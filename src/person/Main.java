package person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();

        Person p1 = new Person("Eddy");
        Person p2 = new Person("Juan");

        /*En caso de que en el constructor no metas una de las variables,
        las puedes definir posteriormente con el set, y si no quieres que cambien,
        les quitas el set en la clase.
         */

        p1.setAddress("C/ Calle Mayor");
        p2.setAddress("C/ Calle En Medio");
        personas.add(p1);
        personas.add(p2);


        for (Person p : personas){
            System.out.println(p);
        }
    }
}
