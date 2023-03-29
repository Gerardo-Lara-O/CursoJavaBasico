package com.example.EstructurasDeControl.condicionales;

public class IfElse {
    public static void main(String[] args) {
        String dia = "Viernes";

        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Lunes"); //usamos el metodo equals para comparar strings

        if(dia.equals("Lunes")){
            System.out.println("Animo con la semana champion");
        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de mesa");
        }else if (dia.equals("Miercoles")) {
            System.out.println("mi miercoles");
        }else if (dia.equals("Jueves")) {
            System.out.println("Ya es jueves");
        }else if (dia.equals("Viernes")) {
            System.out.println("Vamos a loquear");
        }else{
            System.out.println("Es fin de semana");
        }

    }
}
