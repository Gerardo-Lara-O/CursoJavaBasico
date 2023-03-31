package com.example.EstructurasDeControl.repeticion;

public class For {
    public static void main(String[] args) {
        // Ejemplo de contador
//        for (int i = 0; i <= 10; i++)
//            System.out.println("El valor de i = a: " + i);

        //Ejemplo1 array
//        String[] nombres = {"pepe", "Juan", "Ruperta"}; //array
//        for (int i = 0; i< nombres.length;i++){ //usamos el metodo .lenght
//            System.out.println(nombres[i]);
//        }

        //Ejemplo2 con arrays
        int suma = 0;
        int[] numeros = {5,5,5};
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println(suma);
    }
}
