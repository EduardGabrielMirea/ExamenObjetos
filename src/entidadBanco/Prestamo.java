package entidadBanco;

import java.util.Set;

public class Prestamo {
    private int numero;
    private int cantidad;
    private Scucrsal scucrsal;
    private Cliente cliente;

    public Prestamo(int numero,int cantidad) {
        this.numero = numero;
        this.cantidad = cantidad;
        this.scucrsal = getScucrsal();
        this.cliente = getCliente();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Scucrsal getScucrsal() {
        return scucrsal;
    }

    public void setScucrsal(Scucrsal scucrsal) {
        this.scucrsal = scucrsal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "El numero del prestamo es: "+this.numero+ "\n\t\t\t\t\t"+"La cantidad del prestamo es: "+this.cantidad;
    }
}
