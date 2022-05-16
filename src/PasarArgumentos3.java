public class PasarArgumentos3 {

    public static void test(Perro p,Perro p2){

        p2=new Perro("Doberman","Dientitos");
        boolean resultado = p.equals(p2);
        System.out.println((resultado)?"Son el mismo perro":"Son perros diferentes");
    }

    public static void test2(Perro p,Perro p2){

        boolean resultado = p.equals(p2);
        System.out.println((resultado)?"Son el mismo perro":"Son perros diferentes");
    }

    public static void main(String[] args) {

        Perro perrito = new Perro("Chihuahua","Malaquías");
        Perro perrito2 = perrito;
        Perro perrito3 = new Perro("Chihuahua","Malaquías");

        test(perrito,perrito2);
        test(perrito,perrito3);

        test2(perrito,perrito2);
        test2(perrito,perrito3);

        /*
        perrito.nombre="Toby";
        perrito.raza="Bulldog";
        System.out.println("El perrito " + perrito.nombre + " que es un " + perrito.raza + " dice " + perrito.ladrar());
        */
    }

}
