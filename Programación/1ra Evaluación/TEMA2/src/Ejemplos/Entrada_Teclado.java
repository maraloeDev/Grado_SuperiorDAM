/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

//Usaremos la clase Scanner por que facilita el trabajo

import java.util.Scanner;

public class Entrada_Teclado {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //Creamos el objeto Scanner SOLO UNA VEZ y lo usamos las veces necesarias

        System.out.println("Dime tu edad ");
        int edad = teclado.nextInt();
        System.out.print("Has introducido " + edad);
    }
}
