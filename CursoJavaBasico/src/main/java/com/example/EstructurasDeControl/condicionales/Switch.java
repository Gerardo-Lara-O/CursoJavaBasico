package com.example.EstructurasDeControl.condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Domingo";

        switch(dia){
            case "Lunes":
                System.out.println("Hoy es lunes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
            case "Jueves":
                System.out.println("Hoy es Jueves");
            case "Viernes":
                System.out.println("Hoy es Viernes");
            default:
                System.out.println("Es fin de semana");

        }
    }
}
