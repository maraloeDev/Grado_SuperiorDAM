/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ortsanma
 */
public class Problema1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//scanner
        
        int numeroRandom = (int) (Math.random() * (100 - 1)) + 1;//numero aleatorio entre 1 y 100
        int numero = 0;//numero que introduce el usuario
        int marcasup = 100;//franja superior del rango en el que esta el numero random
        int marcainf = 1;//franja inferior del rango en el que esta el numero random

        for (int i = 50; numero != numeroRandom; i = i / 2) {//un bucle for que el contador i, sera 50, y se ira
                                                             //reduciendo entre dos para pillar os valores 25, 12, ..
                                                             // como en el ejemplo, este terminara cuando numero sea igual a numeroRandom
            System.out.println("El n secreto esta entre " + marcainf + " y " + marcasup + "\n"
                    + "Cual es?");//introducimos el enunciado
            numero = sc.nextInt();//recogemos el numero
            
            if (numeroRandom >= marcasup / 2 && i != 0) {//si el numeroRandom es mayor  la franja inferior iar subiendo
                marcainf = marcainf + i;

            } else if (numeroRandom < marcasup / 2 && i != 0) {//en cambio si es menor la franja superior ira bajando

                marcasup = marcasup - i;
            }
            if (marcainf >= numeroRandom) {//una vez la franja inferior llegue o se pase del numeroRandom se queda con ese valor
                marcainf = numeroRandom;
                marcasup = marcasup + 1;
            }
            if (marcasup < numeroRandom) {//e igual pasa si la superior es menor
                marcasup = numeroRandom;
                marcainf = marcainf + 1;
            }
            if (i == 50 && marcainf != 1){//este if esta puesto porque la franja inferior al empiezar en 1, para que 
                                           //se le quite ese uno de masy sea un valor justo
                marcainf = marcainf-1;
            }
        }
        System.out.println("Acertaste!!");//Una vez acertado respondemos que acerto
    }
}
