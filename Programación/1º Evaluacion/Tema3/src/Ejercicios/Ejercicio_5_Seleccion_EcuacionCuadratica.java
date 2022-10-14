/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5_Seleccion_EcuacionCuadratica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de a ");
        int a = teclado.nextInt();

        System.out.println("Introduce el valor de b ");
        int b = teclado.nextInt();

        System.out.println("Introduce el valor de c ");
        int c = teclado.nextInt();
        
        double x1 = 0;
        double x2 = 0;
        
        if( a ==0 || (b == 0) || (c == 0)){
            System.out.println("Ningun coeficiente el cero");
        } else{
            
        double potencia = Math.pow(b, 2) - (4 * a * c);

         x1 = (-b - Math.sqrt(potencia) / 2 * a);

         x2 = (-b + Math.sqrt(potencia) / 2 * a);
        }


        System.out.println("\nX1 = " + x1);

        System.out.println("\nX2 = " + x2);

    }
}
