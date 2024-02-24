package entidadBanco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String dni;
    private String nombre;
    private Set<Prestamo> prestamos;
    private Set<CuentaCorriente> cuentaCorrientes;

    public Cliente(String nombre,String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.prestamos = new HashSet<>();
        this.cuentaCorrientes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
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

    public void addPrestamos(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }
    public void addCC(CuentaCorriente cuentaCorriente){
        this.cuentaCorrientes.add(cuentaCorriente);
    }
    @Override
    public String toString(){
        return "El cliente "+this.nombre+", con DNI --> "+this.dni;
    }

}
