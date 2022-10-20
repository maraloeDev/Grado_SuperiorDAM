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
     *
     *
     * Ejercicio
     * Programa que pida al usuario repetidamente números hasta que introduzca cero
     * Para cada número introducido, tendra que decir si es par o impar
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int contador=0;

        while (numero != 0){
            System.out.println("Introduce un numero");
            numero= teclado.nextInt();
contador++;
        }
            if ((numero%2)==0){
                System.out.println("Es par");
            }
        System.out.println("Has acabado");
    }


}
