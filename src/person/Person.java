package person;

public class Person {
    private String name;
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "El nombre: " +this.name+ "\n\t"+"La dirección: "+this.address;
    }
}
