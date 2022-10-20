/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejemplos;

import java.util.Scanner;

public class Ejemplo_Banderas {

    /**
     * Una bandera es una variable booleana que ouede tener dos posibles valores
     * Usos
     * - Bucles para controlar la permanencia.
     * - if-else para ejecutar instrucciones dependiendo de su valor.
     * <p>
     * Ejercicio
     * Programa que muestre alternativamente 2 frases introducidad por teclado
     * Un numero de veces aleatorio entre 10 y 20
     * <p>
     * Ej :
     * <p>
     * Frase1: Hola pepe (bandera == true)
     * Frase2: Adios pepe (bandera == false)
     * Veces: 11
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Frase1 : ");
        String Frase1 = teclado.nextLine();

        System.out.print("Frase2 : ");
        String Frase2 = teclado.nextLine();
        double aleatorio = (int) (10 * Math.random() + 10);
        boolean bandera1 = true;
        int contador = 0;
        while (contador < aleatorio) {

            if (bandera1 == true) {
                System.out.println("Frase1: " + Frase1);
                bandera1 = false;
            } else {
                System.out.println("Frase2: " + Frase2);
                bandera1 = true;

            }
            contador++;
        }
        System.out.println("El numero de veces introducidas es de " + contador);

    }

}
