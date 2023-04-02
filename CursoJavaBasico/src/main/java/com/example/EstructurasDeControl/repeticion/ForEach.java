package com.example.EstructurasDeControl.repeticion;

public class ForEach {
    public static void main(String[] args) {
        /*
         * Vamos a poner el nombre de nuestro arreglo a la derecha (nombres)
         * Tenemos que agregar una variable, por cada iteracion, como nuestro array es String lo dejamos como string
         * y en medio le damos el nombre a esa variable para poder hacer referencia (nombre)
         */

        String[] nombres = {"Gerardo", "Paola","Carlos"};
        for (String nombre:nombres) {
            System.out.println(nombre);
        }

        //Ejercicio
        //Hacer una suma con los numeros agregados en un array
        int suma = 0;
        int[] numeros = {5,5,5};
        for (int numero:numeros){
            suma += numero;
        }
        System.out.println(suma);


    }
}
