/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Random;

/**
 *
 * @author maraloed
 */
/**
 * Programa que cree palabras de tamaño aleatorio (minimo 1 y maximo 25) cuyos
 * caracteres sean tambien generados tambien aleatoriamente
 *
 * NOTAS 1* Usa la clase random para generar los aleatorios 2* Los caracteres
 * que forman las palabras seran imprimibles
 *
 * Palabra generada (tamaño 5) cx12Z
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Random random = new Random();

        char caracterMayus = (char) (random.nextInt(65, 90)); // Caracteres entre a y z
        char caracterMinus = (char) (random.nextInt(97, 122)); // Caracteres entre A y Z
        int numero = random.nextInt(1, 25); //Numeros aleatorios entre 1 y 25

        String caraMayus = String.valueOf(caracterMayus);
        String caraMinus = String.valueOf(caracterMinus);
        String num = String.valueOf(numero);

        int totalMay = caraMayus.length();
        int totalMin = caraMinus.length();
        int totnum = num.length();

        System.out.println("Palabra generada (tamano " + (totalMay + totalMin + totnum) + ")"
                + caracterMayus + "" + caracterMinus + "" + numero);

    }

}
