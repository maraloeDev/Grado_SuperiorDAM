/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author maraloed
 */

/* Realiza un programa qu e pida repetidamente frases al usuario hasta que no introduzca nada.

El programa finalizara mostrando la frase más larga

Ejemplo 
Introduce una frase Hola
Introduce una frase Hola caracola
Introduce una frase Estoy cansadisimo
Introduce una frase

La frase mas larga introducida ha sido "Estoy cansado"*/
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena="";
        String cadenaMayor="";
        int longitudMayor=0;
        do {
            System.out.println("Introduce una cadena");
            cadena=teclado.nextLine();
            if(!cadena.isBlank()){
                if(cadena.length() > longitudMayor ){
                    cadenaMayor=cadena;
                }
                
            }
        } while (!cadena.isBlank());
        
        System.out.println("La palabra mas larga es " + cadenaMayor);
    }

}
