package Examen;

import java.util.Scanner;

public class Caballos {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Introduce un nombre: ");
        Scanner teclado = new Scanner(System.in);

        //Doy valor a los caballos

        String caballo1 = "";
        String caballo2 = "";

        //INFORMACIÓN

        String nombre; //Inicio la variable

        nombre = teclado.nextLine(); //Utilizo la variable

        System.out.println("El nombre de usuario es " + nombre); //Muestro rl nombre del usuario

        int contador = 0; //creo un contador para el for

        for (int i = 0; i < nombre.length(); i++) {

            char letra = nombre.charAt(i);

            contador = contador + letra;
        }
        System.out.println("Meta en " + contador);

        //CABALLOS ALEATORIOS
        do {

            int aleatorio = (int) (Math.random() * 10); //Creo un numero Random para wue corran los caballos, y depende del numero que salga, sale uno antes que otro


            if (aleatorio < 5) {                      //Asingando que si aleatorio es menor que 5. a caballo1 se sumas y le asignas la cadena 1
               caballo1 += "1";
            } else
               caballo2 += "2";

            System.out.println(caballo1 + "\n" + caballo2 + "\n"); // Mostrar los caballos en consola


            if (caballo1.length() == contador) {
                System.out.println("El caballo ganador es el 1");
            } else if (caballo2.length() == contador) {
                System.out.println("El caballo ganador es el 2");
            }
            /*Thread.sleep(500);*/

        } while (caballo1.length() < contador && caballo2.length() < contador);
    }

}