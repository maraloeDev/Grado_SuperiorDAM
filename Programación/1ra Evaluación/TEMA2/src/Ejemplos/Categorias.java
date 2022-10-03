/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class Categorias {

    public static void main(String[] args) {

        //Determinar la categoria en funcion de la edad teniendo en cuenta los siguientes rangos
        // Categoria        Rango
        //  Junior            [18,30)
        //  Senior            (30,50)
        //La edad por teclado y por consola la categoria
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");

        int edad = teclado.nextInt();

        String categoria = (edad >= 18 && edad <= 30) ? "Junior"
                : (edad > 30 && edad <= 50) ? "Senior" : "Categoria no contemplada";

        System.out.println("La edad que tienes es de " + edad + " y a la categoria que perteneces es a " + categoria);

        System.out.println("Para esta edad la categoria es :" + categoria);
    }
}
