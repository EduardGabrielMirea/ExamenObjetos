package aire;

public class Aire {
    private String marca;
    private int tempMax;
    private int tempMin;
    private int tempIncial;
    private int tempFinal;


    public Aire(String marca, int tempMax, int tempMin, int tempIncial) {
        this.marca = marca;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.tempIncial = tempIncial;
        this.tempFinal = tempIncial;
    }

    public String getMarca() {
        return marca;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempIncial() {
        return tempIncial;
    }

    public void setTempIncial(int tempIncial) {
        this.tempIncial = tempIncial;
    }

    public int getTempFinal() {
        return tempFinal;
    }

    public void setTempFinal(int tempFinal) {
        this.tempFinal = tempFinal;
    }

    public void subir(){
      if (this.tempFinal +1 <= this.tempMax){
          this.tempFinal++;
      }else {
          throw new IllegalArgumentException("La temperatura no puede superar "+this.tempMax);
      }
    }
    public void bajar(){
        if (this.tempFinal -1 >= this.tempMin){
            this.tempFinal--;
        }else {
            throw new IllegalArgumentException("La temperatura no puede ser inferior a "+this.tempMin);
        }
    }


    @Override
    public String toString(){
        return "Aire: "+ "\n\t"+"La marca: "+this.marca+"\n\t"+"La temperatura inicial: "+this.tempIncial+"\n\t"+"La temperatura final: "+this.tempFinal;
    }
}
