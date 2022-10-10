package src.EjerciciosPropuestos;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {


            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero");
            int n1 = teclado.nextInt();

            System.out.println("Introduce un numero");
            int n2 = teclado.nextInt();

            if (n1 % n2 == 0) {
                System.out.println("Es divisible");
            } else {
                System.out.println("No es divisible");
            }

        }
    }
