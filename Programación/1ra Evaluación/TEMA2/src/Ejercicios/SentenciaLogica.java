/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class SentenciaLogica {

    public static void main(String[] args) {
        Scanner telado = new Scanner(System.in);

        boolean negativo = false;
        boolean positivo = true;
        System.out.println("Introduce un numero :");

        int num = telado.nextInt();

        if (num < 0){
            System.out.println(negativo);
        } else if (num >= 100) {
            System.out.println(positivo);

        } else {
            System.out.println(positivo);
        }


    }
}
