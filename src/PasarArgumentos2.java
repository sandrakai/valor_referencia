public class PasarArgumentos2 {

    public static void test(int[] miArray){
        //Recibimos POR VALOR la referencia del objeto aEdades
        //Las referencias se envían por valor, ya que una referencia es un valor en java
        //Tener en cuenta que un objeto de tipo array es mutable
        System.out.println("Iniciamos el método test()");

        for (int i=0;i<miArray.length;i++){
            miArray[i] +=10;
        }
    }

    public static void main(String[] args) {

        int[] aEdades = {10,11,12};
        System.out.println("Iniciamos el método main");

        //Mostramos por orden los valores del array

        for (int i=0;i<aEdades.length;i++){
            System.out.println("Inicial aEdades " + i + " = " + aEdades[i]);
        }

        test(aEdades);

        for (int i=0;i<aEdades.length;i++){
            System.out.println("Final aEdades " + i + " = " + aEdades[i]);
        }
    }
}
