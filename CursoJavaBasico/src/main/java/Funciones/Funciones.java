package Funciones;

public class Funciones {
    public static void main(String[] args) {
        /*
        Las funciones van a ser un bloque de codigo qeu quiera repetir
         */

        // opcion1: funcion sin parametros y sin tipo de retorno
//        showMenu();

        //opcion2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);


    }
    // identificador | parentesis | llaves
    static void showMenu(){
        System.out.println("Bienvenido al E-comerce de zapatillas:");
        System.out.println("1 - ver zapatillas");
        System.out.println("2 - comprar zapatillas");
        System.out.println("3 - salir");
    }

    static String getMenu(){
        return "Bienvenido al E-comerce de zapatillas: \n 1 - ver zapatillas";
    }
}
