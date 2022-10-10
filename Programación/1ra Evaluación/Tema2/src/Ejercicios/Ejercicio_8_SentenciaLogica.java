/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_8_SentenciaLogica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero");
        int numero = teclado.nextInt();

        boolean negativo = (numero < 0);
        boolean positivoMenor = (numero >= 0) && (numero < 100);
        boolean mayorIgual = (numero >=100);

        System.out.println("\tEl numero es negativo? \t " + negativo);
        System.out.println("\tEl numero es positivo o menor que 100? \t " + positivoMenor);
        System.out.println("\tEl numero es mayor o igual que 100? \t " + mayorIgual);
    }
}
