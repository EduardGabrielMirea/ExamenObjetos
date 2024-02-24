package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cuenta> cuentas = new ArrayList<>();

        Cuenta c1 = new Cuenta("Eddy",2000);
        Cuenta c2 = new Cuenta("Juan");
        cuentas.add(c1);
        cuentas.add(c2);

        //Si quieres ver las excepciones descomenta las acciones con //.
        try{
            //ingresar
            c1.ingresar(1000);
            //c1.ingresar(-10);

            c2.ingresar(100.5);

            //retirar
            c1.retirar(1000);
            //c1.retirar(3000);

            c2.retirar(100);

        }catch (IllegalArgumentException e){
            System.out.println("Error al ingresar el dinero: "+ e.getMessage());
        }

        for (Cuenta x: cuentas){
            System.out.println(x);
        }

    }
}
