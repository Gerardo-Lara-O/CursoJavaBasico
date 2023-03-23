package com.example.Funciones;

public class Funciones {
    public static void main(String[] args) {
        /*
        Las funciones van a ser un bloque de codigo qeu quiera repetir
         */

        // opcion1: funcion sin parametros y sin tipo de retorno
//        showMenu();

        //opcion2: funcion sin parametros y con tipo de retorno
//        String menu = getMenu();
//        System.out.println(menu);
//        System.out.println(getMenu());
//
//        double price = getPrice();
//        System.out.println(price);

        //Opcion3 : funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("Gerardo");

        //opcion 4: funcion con parametros y con tipo de retorno
        String nombre = "Gerardo";
        String apellido = "Lara";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);



    }



    // identificador | parentesis | llaves
    //opcion 1
    static void showMenu(){
        System.out.println("Bienvenido al E-comerce de zapatillas:");
        System.out.println("1 - ver zapatillas");
        System.out.println("2 - comprar zapatillas");
        System.out.println("3 - salir");
    }

    //opcion 2
    static String getMenu(){
        System.out.println("Imprimiendo texto prueba");
        return "Bienvenido al E-comerce de zapatillas: \n 1 - ver zapatillas";
    }


    //opcion 3
    static double getPrice() {
        return 100.99;
    }
    static void imprimirSaludoBuenosDias(String name){
        System.out.println("Buenos dias " + name);
    }

    //opcion 4
    static String obtenerSaludo(String nombre, String apellidos){
        return "Buenas tardes "+ nombre + " " + apellidos;
    }




}
