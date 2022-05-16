public class Perro {

    //propiedad o atributos

    public String raza;
    public String nombre;

    //constructor

    public Perro(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }

    //métodos

    public String ladrar(){
        return "guau guau";
    }
}
