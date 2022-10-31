/*******************************************************************************
 Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ******************************************************************************/
package Ejercicios.Ejercicios_dia_Huelga;

import java.util.Scanner;

public class Ejercicio_3 {

    /** Imprimir las letras de una frase introducida por teclado de una forma alternativa,
     *  es decir,  una de la parte final y la siguiente de la inicial, hasta recorrer todos los caracteres de la misma.
     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce cadena: ");
        String cadena=sc.next();

        int longitud=cadena.length();
        for(int i=0; i<longitud/2; i++){
            System.out.print(cadena.charAt(i)); //del principio
            System.out.print(cadena.charAt(longitud-1-i));
        }

        //si la cadena es impar
        if(longitud%2!=0){
            System.out.println(cadena.charAt(longitud/2));
        }

        System.out.println();


    }

    }
