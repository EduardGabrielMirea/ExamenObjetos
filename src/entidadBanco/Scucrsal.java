package entidadBanco;

import java.util.HashSet;
import java.util.Set;

public class Scucrsal {
    private String nombre;
    private Banco banco;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentaCorrientes;

    public Scucrsal(String nombre) {
        this.nombre = nombre;
        this.banco = getBanco();
        this.prestamos = new HashSet<>();
        this.cuentaCorrientes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Banco getBanco() {
        return banco;
    }


    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Set<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public void setCuentaCorrientes(Set<CuentaCorriente> cuentaCorrientes) {
        this.cuentaCorrientes = cuentaCorrientes;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCC(CuentaCorriente cuentaCorriente) {
        this.cuentaCorrientes.add(cuentaCorriente);
    }

    @Override
    public String toString(){
        return "La sucursal --> "+this.nombre;
    }
}
