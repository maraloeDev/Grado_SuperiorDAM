/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.function.Predicate;

public class Ejercicio_5_PorcentajeNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero correspondiente al numero de sobresalientes :");
        int sobreSalientes = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de notables :");
        int notables = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de aprobados :");
        int aprobados = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de suspensos :");
        int suspensos = teclado.nextInt();

        System.out.print("Introduce un numero entero correspondiente al numero de no presentados :");
        int noPresentados = teclado.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        int total = (sobreSalientes + notables + aprobados + suspensos + noPresentados);

        System.out.print("El numero total de alumnos es de: " + total + " alumnos");

        System.out.println("--------------------RELULTADOS-------------------- ");

        System.out.println("SB=" + sobreSalientes + "(" + (sobreSalientes / total) * 100 + "%)");
        System.out.println("N=" + notables + "(" + (notables / total) * 100 + "%)");
        System.out.println("A=" + aprobados + "(" + (aprobados / total) * 100 + "%)");
        System.out.println("S=" + suspensos + "(" + (suspensos / total) * 100 + "%)");
        System.out.println("NP=" + noPresentados + "(" + (noPresentados / total) * 100 + "%)");
        System.out.println("Total=" + total + "(" + total * 100 + "%)");

        System.out.println("-----------------------TOTAL------------------------------------");

        System.out.println("Total presentados=" +
               total + "%)");
        System.out.println("Total aprobados=" +
                "(" + (sobreSalientes + notables + aprobados) * 100 / (total - noPresentados) + "%)");
        System.out.println("Total suspensos=" +
                "(" + suspensos * 100 / (total - suspensos) + "%)");
        System.out.println("Total no presentados=" +
                "(" + (noPresentados / total) / (total - noPresentados) + "%)");
    }
}
