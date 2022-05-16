public class PasarArgumentos {

    public static void test(int miValor){

        System.out.println("Iniciamos el método test()");
        System.out.println("Valor recibido en el método test(): " + miValor);
        miValor=35;
        System.out.println("Después de modificar mi valor en el método, su valor actual es: "+ miValor);
        System.out.println("Finaliza el método test()");
    }

    public static void test2(Integer miValor){

        System.out.println("Iniciamos el método test()");
        System.out.println("Valor recibido en el método test(): " + miValor);
        miValor=3500;
        System.out.println("Después de modificar mi valor en el método, su valor actual es: "+ miValor);
        System.out.println("Finaliza el método test()");
    }

    public static void main(String[] args) {

        int i = 100;
        Integer j = 200;

        System.out.println("El valor inicial de i es " + i);
        test(i);
        System.out.println("El valor final de i es " + i);
        System.out.println("----------------------------------");
        System.out.println("El valor inicial de j es " + j);
        test(j);
        System.out.println("El valor final de j es " + j);
        System.out.println("----------------------------------");
        System.out.println("El valor inicial de j es " + j);
        test2(j);
        System.out.println("El valor final de j es " + j);
        System.out.println("----------------------------------");


    }
}
