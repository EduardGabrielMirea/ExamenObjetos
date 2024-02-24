package banco;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double cantidadInicial;
    private double canitdadFinal;
    private double cantidadIngresada;
    private double cantidadRetirada;

    public Cuenta(String titular, double cantidadInicial) {
        this.titular = titular;
        this.cantidadInicial = cantidadInicial;
        this.canitdadFinal = cantidadInicial;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidadInicial = 0;
        this.canitdadFinal = 0;
    }

    public double getCantidadIngresada() {
        return cantidadIngresada;
    }

    public double getCantidadRetirada() {
        return cantidadRetirada;
    }

    public double ingresar(double cuantoIngresa) {
        if (cuantoIngresa <= 0) {
            throw new IllegalArgumentException("La cantidad tiene que superar los 0 euros");
        } else {
            this.cantidadIngresada += cuantoIngresa;
            this.canitdadFinal = this.cantidadInicial + this.cantidadIngresada - this.cantidadRetirada;
        }
        return this.canitdadFinal;
    }

    public double retirar(double cuantoRetira) {
        if (this.canitdadFinal - cuantoRetira < 0) {
            throw new IllegalArgumentException("No se puede retirar más dinero del que tienes en la cuenta. Saldo actual: " + this.canitdadFinal + " euros");
        } else {
            this.cantidadRetirada += cuantoRetira;
            this.canitdadFinal = this.cantidadInicial + this.cantidadIngresada - this.cantidadRetirada;
        }
        return this.canitdadFinal;
    }

    @Override
    public String toString() {
        return "Cuentas: " + "\n\t" + "El titular: " + this.titular + "\n\t\t" + "La cantidad incial en la cuenta: " + this.cantidadInicial + " euros"
                + "\n\t\t\t" + "Cuanto ha ingresado: " + this.cantidadIngresada + " euros" + "\n\t\t\t" + "Cuanto ha retirado: " + this.cantidadRetirada
                + " euros" + "\n\t\t" + "Cantidad final en la cuenta: " + this.canitdadFinal + " euros";
    }
}
