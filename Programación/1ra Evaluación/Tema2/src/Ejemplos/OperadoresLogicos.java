/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/
package Ejemplos;

import java.util.Scanner;

public class OperadoresLogicos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Logicos
        System.out.println("OPERADORES LOGICOS");
        System.out.println("------------------");
        final double UMBRAL = 20.0;

        double temperatura = 15.0;

        //Indica la temperatura minima para considerar que hace bueno
        //Consideramos que hace buen tiempo si la temperatura eds igual o superior al UMBRAL
        //y me quedo en casa si hace malo, o no tengo dinero
        //RESULTADO DEL PROGRAMA HACE BUENO, ENCASA
        System.out.print("Indique una temperatura: ");
        temperatura = teclado.nextDouble();

        boolean soleado = true;
        boolean tengoDinero = true;

        boolean buentiempo = (temperatura >= UMBRAL) && (soleado == true);
        boolean enCasa = !buentiempo || (tengoDinero == false);

        System.out.println("Hace bueno? " + buentiempo);
        System.out.println("Me quedo en casa? " + enCasa);
    }

}
