/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Ejemplo_Banderas2 {

    /**
     * Una bandera es una variable booleana que puede tener dos posibles valores
     * Usos
     * - Bucles para controlar la permanencia.
     * - if-else para ejecutar instrucciones dependiendo de su valor.
     * <p>
     * <p>
     * <p>
     * Ejercicio
     * Programa que pida al usuario repetidamente números hasta que introduzca cero
     * Para cada número introducido, tendra que decir si es par o impar
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int contador = 0;

        boolean bandera1 = true;

        while (numero != 0) {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            if (numero < 0){
                System.out.println("ES UN NUMERO NEGATIVO!!");
            }
        else if ((numero % 2) == 0) {
                System.out.println("Es par");
                bandera1 = true;
            } else {
                System.out.println("Es impar");
                bandera1 = false;
            }
            contador++;

        }
        System.out.println("Has acabado. Has introducido " + contador + " pares");
    }


}
