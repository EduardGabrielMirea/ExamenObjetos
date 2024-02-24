package entidadBanco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nombre;
    private Set<Scucrsal> scucrsals;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.scucrsals = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }


    public Set<Scucrsal> getScucrsals() {
        return scucrsals;
    }

    public void setScucrsals(Set<Scucrsal> scucrsals) {
        this.scucrsals = scucrsals;
    }

    public void addSucursal(Scucrsal scucrsal){
        this.scucrsals.add(scucrsal);
    }

    @Override
    public String toString(){
        return "El banco: "+this.nombre;
    }
}
