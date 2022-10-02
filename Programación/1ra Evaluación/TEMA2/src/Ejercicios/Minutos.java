/*******************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ******************************************************************************/

package Ejercicios;

import java.util.Scanner;

public class Minutos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el numero de segundos");
        
        int  segundos = teclado.nextInt();
        
        int minutos = 60;
        
        int equivalencia = segundos / minutos; //Divido los minutos entre los segundos
        
        int equivalencia2 = segundos % minutos; //Recojo el resto
        System.out.println(segundos + " s = " + equivalencia + " m " + equivalencia2 + " s" ); //Muestro en pantalla
    }
}
