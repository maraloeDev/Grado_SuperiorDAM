
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MART�N-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class Juego_De_Los_Dados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         * ************* ALEATORIO Y TOTAL DE LA MAQUINA
         *
         */

        int dado1_Maquina = ((int) (Math.random() * 6) + 1);
        int dado2_Maquina = ((int) (Math.random() * 6) + 1);
        int totalPuntos_M = dado1_Maquina + dado2_Maquina;

//int tpm= ((int) (Math.random() * 6)+1)+ ((int) (Math.random() * 6)+1);
        /**
         * ************* ALEATORIO Y TOTAL DEL JUGADOR
         * /
         */
        int dado1_Jugador = ((int) (Math.random() * 5));
        int dado2_jugador = ((int) (Math.random() * 5));
        int totalPuntos_J = dado1_Jugador + dado2_jugador;
//int tpj= ((int) (Math.random() * 5))+ ((int) (Math.random() * 5));

        char respuesta;
        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;
        int punto = 0;
        int historial = 0;

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************");

        System.out.print("Te atreves a jugar contra mi (S/N):");
        respuesta = teclado.nextLine().charAt(0);

       // if (respuesta == 'S') {

            while (respuesta != 'S' && respuesta != 's') {
                System.out.println("Lo siento, no te he entendido bien, podrias repetirlo");
                System.out.println("Te atreves a jugar contra mi? (S/N):");
                respuesta = teclado.next().charAt(0);

            }
            System.out.println("-----------------------------------------");
            System.out.println("Banca: " + banca + " euros" + "\n"
                    + "Bote Maquina: " + bote_Maquina + " euros" + "\n"
                    + "Bote Jugador: " + bote_Jugador + " euros");

            System.out.println("Empieza la partida el que saque mas puntos...");

            System.out.println("Puntos del jugador : " + totalPuntos_J);
            System.out.println("Puntos de la maquina : " + totalPuntos_M);
            System.out.println("Empiezas");
            System.out.println("");
            System.out.println("Juegas...");

            System.out.print("Tirada de salida : " + punto);
            System.out.println(" Punto : " + punto);
            System.out.println("Tirada para el punto " + punto);

            if (totalPuntos_J == 7 || totalPuntos_J == 11) {
                System.out.println("Enhorabuena. Has ganado!!!");
                int restoJsum = bote_Jugador + 15;
                int restoMres = bote_Maquina - 15;
                System.out.println("");
                System.out.println("Banca " + banca);
                System.out.println("Bote Maquina: " + restoMres + " euros");
                System.out.println("Bote Jugador: " + restoJsum + " euros");

            } else if (totalPuntos_J == 2 || totalPuntos_J == 3 || totalPuntos_J == 12) {
                System.out.println("Lo siento. He ganado");
                int restoJres = bote_Jugador = bote_Jugador - 15;
                int restoMsum = bote_Maquina = bote_Maquina + 15;
                int bancaPerder = banca + 15;
                System.out.println("");
                System.out.println("Banca " + bancaPerder);
                System.out.println("Bote Maquina: " + restoJres + " euros");
                System.out.println("Bote Jugador: " + restoMsum + " euros");
            } else if (totalPuntos_J == 4 || totalPuntos_J == 5 || totalPuntos_J == 6 || totalPuntos_J == 8 || totalPuntos_J == 9 || totalPuntos_J == 10) {
                totalPuntos_J = punto;

            }
            while (respuesta == 'S') {
                historial++;
            }

            System.out.println("Continuamos jugando? (S/N) :");
            respuesta = teclado.next().charAt(0);

            main(null);

     //   } else {
     if(respuesta=='N'){
            System.out.println("GRACIAS POR JUGAR CONMIGO!!");
            System.out.println("Has jugado un total de " + historial + " veces");

        }
    }

    }
//}
