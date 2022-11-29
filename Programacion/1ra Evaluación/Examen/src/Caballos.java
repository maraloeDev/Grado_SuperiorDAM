
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 *****************************************************************************
 */
/**
 *
 * @author Eduardo Martin-Sonseca
 */
public class Caballos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String caballo1 = "";
        String caballo2 = "";

        System.out.print("Nombre de usuario: ");
        String nombre = teclado.nextLine();

        int contador = 0;

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            contador = contador + letra;

        }
        System.out.println("Meta en : " + contador);

        do {
            int caballoAleatorio = (int) (Math.random() * 10);

            if (caballoAleatorio < 5) {
                caballo1 += "1";
            } else {
                caballo2 += "2";
            }

            System.out.println(caballo1 + "\n" + caballo2 + "\n");

            if (caballo1.length() == contador) {
                System.out.println("Ha ganado el caballo 1");
            } else if (caballo2.length() == contador) {
                System.out.println("Ha ganado el caballo 2");
            }

        } while (caballo1.length() < contador && caballo2.length() < contador);
    }

}
