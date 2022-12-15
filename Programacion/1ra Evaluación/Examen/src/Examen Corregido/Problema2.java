/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ortsanma
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner
        int DNInum;//variable del numero del DNI
        do {//Bucle para que repita el siguiente try hasta que se introduzca bien el DNI
            try {//Try Catch para controlar que no se meta un caracter que no sea un numeor
                System.out.print("Introduce n DNI:");
                String DNIcad = sc.next();//La recogemos como cadena
                while (DNIcad.length() != 8) {//while para cuando se sobrepase el numero de caracteres de DNI (8)
                    System.out.println("Error. El DNI debe tener 8 digitos\n");
                    System.out.print("Introduce n DNI:");
                    DNIcad = sc.next();
                }
                DNInum = Integer.parseInt(DNIcad);//le damos el valor de la anterior cadena
            } catch (NumberFormatException e) {//Si salta la excepcion el DNI se pondra en valor 0, por lo que se volvera
                                                //a repetir el bucle
                System.out.println("Error. Alguno de los caracteres no es un dígito\n");
                DNInum = 0;
            }
        } while (DNInum == 0);
        int resto = DNInum % 23;//Hacemos la operacion
        System.out.print("Letra: ");
        switch (resto) {//un switch que devuelva que letra corresponde, el ultimo es un default por si acaso
            case 1:
                System.out.println("R");
                break;
            case 2:
                System.out.println("W");
                break;
            case 3:
                System.out.println("A");
                break;
            case 4:
                System.out.println("G");
                break;
            case 5:
                System.out.println("M");
                break;
            case 6:
                System.out.println("Y");
                break;
            case 7:
                System.out.println("F");
                break;
            case 8:
                System.out.println("P");
                break;
            case 9:
                System.out.println("D");
                break;
            case 10:
                System.out.println("X");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("N");
                break;
            case 13:
                System.out.println("J");
                break;
            case 14:
                System.out.println("Z");
                break;
            case 15:
                System.out.println("S");
                break;
            case 16:
                System.out.println("Q");
                break;
            case 17:
                System.out.println("V");
                break;
            case 18:
                System.out.println("H");
                break;
            case 19:
                System.out.println("L");
                break;
            case 20:
                System.out.println("C");
                break;
            case 21:
                System.out.println("K");
                break;
            case 22:
                System.out.println("E");
            default:
                System.out.println("No se encontro ningun valor asignable");
        }

    }
}
