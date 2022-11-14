/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

/**
 * Escribe un programa Java que genere la siguiente tabla:
 *
 * NOTA: La dimensión de la tabla será de como máximo 10 y mínimo1. Este valor
 * será solicitado por teclado. En caso de no cumplir la restricción, el
 * programa lo pedirá de nuevo. Si el usuario no mete ningún valor (ENTER) el
 * programa finalizará.tabla
 *
 * 1 2 3 4 5 6 7 8 9 10 1 2 3 4 5 6 7 8 9 10 2 4 6 8 10 12 14 16 18 20
 * Calificación:
 *
 * Petición dimensión (sin validar): 1 punto Validación dimensión: 3 puntos
 * Generar tabla: 6 puntos
 */
import java.util.Scanner;

public class Ejercicio_3_Tabla {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dimensiones = 0;

        //Peticion de dimensión
        do {
            System.out.println("Introduce las dimensiones");
            dimensiones = teclado.nextInt();
        } while (dimensiones < 1 || dimensiones  > 10 );

        System.out.println("Tabla de " + dimensiones);

        System.out.println("------------------------------------------------------");

        for (int i = 1; i <= dimensiones; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t " + i * j);

            }

        }
        System.out.println("");
    }

}