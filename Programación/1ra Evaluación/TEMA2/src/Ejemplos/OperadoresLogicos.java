/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejemplos;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

        //Logicos
        System.out.println("OPERADORES LOGICOS");
        System.out.println("------------------");
        final double UMBRAL = 20.0;

        double temperatura = 15.0;

        //Indica la temperatura minina para considerar que hace bueno
        //Consideramos que hace buen tiempo si la temperatura eds igual o superior al UMBRAL
        //y me quedo en casa si hace malo, ono tengo dinero
        //RESULTADO DEL PROGRAMA HACE BUENO, ENCASA
        boolean soleado = true;
        boolean tengoDinero = true;

        boolean buentiempo = (temperatura >= UMBRAL) && (soleado == true);
        boolean enCasa = !buentiempo || (tengoDinero == false);

        System.out.println("Hace bueno? " + buentiempo);
        System.out.println("Me quedo en casa? " + enCasa);
    }

}
