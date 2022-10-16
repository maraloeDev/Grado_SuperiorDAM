/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

public class Ejercicio_4_Seleccion_OperacionesAritmeticas {

    public static void main(String[] args) {

        int aleatorio = (int) (9 * Math.random() + 1);
        int aleatorio2 = (int) (9 * Math.random() + 1);
        System.out.println(" El numero " + aleatorio + " + " + aleatorio2 + " es  " + (aleatorio + aleatorio2));
        System.out.println(" El numero " + aleatorio + " - " + aleatorio2 + " es  " + (aleatorio - aleatorio2));
        System.out.println(" El numero " + aleatorio + " * " + aleatorio2 + " es  " + (aleatorio * aleatorio2));
        System.out.println(" El numero " + aleatorio + " / " + aleatorio2 + " es  " + (aleatorio / aleatorio2));
        System.out.println(" El numero " + aleatorio + " % " + aleatorio2 + " es  " + (aleatorio % aleatorio2));


    }


}
