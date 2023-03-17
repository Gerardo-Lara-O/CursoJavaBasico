package Funciones;

public class OperadoresComparacion {
    public static void main(String[] args) {
        /*
        Comparacion:
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
         */

        int numero1 = 10;
        int numero2 = 20;

        boolean resultado1 = numero1 > numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 > numero2;
        System.out.println(resultado2);


        /*
        Logicos:
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;


    }
}
