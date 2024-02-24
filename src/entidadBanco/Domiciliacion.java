package entidadBanco;

public class Domiciliacion {
    private int numero;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int numero) {
        this.numero = numero;
        this.cuentaCorriente = getCuentaCorriente();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }
    @Override
    public String toString(){
        return "El numero de la domiciliacion es --> " +this.numero;
    }
}
