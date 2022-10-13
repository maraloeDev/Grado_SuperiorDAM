/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/
package Ejemplos;

//Usaremos la clase Scanner por que facilita el trabajo
import java.util.Scanner;

public class Entrada_Teclado {

    public static void main(String[] args) {
//Creamos el objeto Scanner SOLO UNA VEZ y lo usamos las veces necesarias
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu nombre");
        String nombre = teclado.nextLine(); //nextLine lee la siguiente palabra
        //teclado.nextLine();
        System.out.print("Introduce los apellidos:");
        String apellidos = teclado.nextLine();

        System.out.print("Donde vives");
        String direccion = teclado.nextLine();
        
        System.out.print("Introduce tu estatura");
        double estatura = teclado.nextDouble();

        System.out.print("Dime tu edad ");
        int edad = teclado.nextInt();


        System.out.println("");
        System.out.println("Te llamas " + nombre + " " + apellidos);
        System.out.println("Vives en " + direccion);
        System.out.println("Mides " + estatura + " m");
        System.out.println("Tienes " + edad + " anios");
    }
}
