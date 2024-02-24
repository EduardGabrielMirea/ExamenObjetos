package entidadBanco;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {
    private String nombre;
    private Scucrsal scucrsal;
    private Set<Domiciliacion> domiciliacions;
    private Set<Cliente> clientes;

    public CuentaCorriente(String nombre) {
        this.nombre = nombre;
        this.scucrsal = getScucrsal() ;
        this.domiciliacions = new HashSet<>();
        this.clientes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Scucrsal getScucrsal() {
        return scucrsal;
    }

    public void setScucrsal(Scucrsal scucrsal) {
        this.scucrsal = scucrsal;
    }

    public Set<Domiciliacion> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacion> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addDomi(Domiciliacion domiciliacion){
        this.domiciliacions.add(domiciliacion);
    }
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    @Override
    public String toString(){
        return "El nombre de la cuenta corriente --> "+this.nombre;
    }
}
