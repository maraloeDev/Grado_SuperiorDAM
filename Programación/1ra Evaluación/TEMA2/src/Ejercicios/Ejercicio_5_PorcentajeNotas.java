/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;
import java.util.SortedMap;

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

        int alumnos = (sobreSalientes + notables + aprobados + suspensos + noPresentados);

        System.out.print("El numero total de alumnos es de: " + alumnos + " alumnos");

        System.out.println("--------------------RELULTADOS-------------------- ");

        System.out.println("SB=" + sobreSalientes + "(" + (sobreSalientes * 100) / alumnos + "%)");
        System.out.println("N=" + notables + "(" + (notables * 100) / alumnos + "%)");
        System.out.println("A=" + aprobados + "(" + (aprobados * 100) / alumnos + "%)");
        System.out.println("S=" + suspensos + "(" + (suspensos * 100) / alumnos + "%)");
        System.out.println("NP=" + noPresentados + "(" + (noPresentados * 100) / alumnos + "%)");
        System.out.println("Total=" + alumnos + "(" + alumnos * 100 + "%)");
        System.out.println("Total presentados=" +
                (sobreSalientes + notables + aprobados + suspensos + notables) / alumnos * 100 + "%)");
        System.out.println("Total aprobados=" +
                "(" + (sobreSalientes + notables + aprobados) * 100 / (alumnos - noPresentados) + "%)");
        System.out.println("Total suspensos=" +
                "(" + (sobreSalientes + notables + aprobados) * 100 / (alumnos - suspensos) + "%)");
        System.out.println("Total no presentados=" +
                "(" + (noPresentados * 100) / (alumnos - noPresentados) + "%)");
    }
}
