package Funciones;

public class Sobrecarga {
    public static void main(String[] args) {
        int resultado1 = suma(50,50);
        System.out.println("El resultado es: " + resultado1);

    }
    static int suma(int numero1 , int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1 , int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}
