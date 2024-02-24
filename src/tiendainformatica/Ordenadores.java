package tiendainformatica;

public class Ordenadores {
    private String marca;
    private String modelo;
    private int codigo;
    private int capacidadGb;

    public Ordenadores(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadGb() {
        return capacidadGb;
    }

    public void setCapacidadGb(int capacidadGb) {
        this.capacidadGb = capacidadGb;
    }

    @Override
    public String toString(){
        return "Ordenador: "+ "\n"+"Nombre: "+this.marca +"\n"+"Modelo: "+this.modelo+ "\n\t"+"Codigo: "+this.codigo+"\n\t"+"Capacidad en Gb: "+this.capacidadGb +" Gb";
    }
}
