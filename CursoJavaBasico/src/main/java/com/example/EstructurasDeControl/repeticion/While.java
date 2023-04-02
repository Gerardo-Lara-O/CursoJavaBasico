package com.example.EstructurasDeControl.repeticion;

public class While {
    /*
    La diferencia entre un bucle For y un While es que:
    For: es un blucle determinado, osea que sabemos cuando va a terminar
    While: es un bucle indeterminado, no sabemos cuando va a acabar
     */
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            System.out.println("Hola mundo");
            contador ++;
            if(contador == 5){
                continue;
            }
            System.out.println("Valor de contador: " + contador);
        }

        /*
        Crear un bucle que permita concatenar textos y imprima el resultado final por consulta
        Los textos pueden venir de un array String

         */

    }
}
