
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author Eduardo Martin-Sonseca
 */
public class Juego_De_Los_Dados {

    public static void Noel() {

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************\n"
                + "¿Te atreves a jugar contra mí? (S/N):");
        char respuesta = teclado.nextLine().toUpperCase().trim().charAt(0);

        /**
         * ************* ALEATORIO Y TOTAL DE LA MAQUINA /
         */
        Noel();
        /*aqui utilizaría la clase Random y te falta una comprobación, la de quien gana el turno*/
        int dado1_Maquina = ((int) (Math.random() * 6) + 1);
        int dado2_Maquina = ((int) (Math.random() * 6) + 1);
        int totalPuntos_M = dado1_Maquina + dado2_Maquina;
        boolean turno = true; //Creo una bandera en la que true es para ver quien tiene el turno

//int tpm= ((int) (Math.random() * 6)+1)+ ((int) (Math.random() * 6)+1);
        /**
         * ************* ALEATORIO Y TOTAL DEL JUGADOR /
         */
        int dado1_Jugador = ((int) (Math.random() * 6) + 1);
        int dado2_jugador = ((int) (Math.random() * 6) + 1);
        int totalPuntos_J = dado1_Jugador + dado2_jugador;
//int tpj= ((int) (Math.random() * 6)+1)+ ((int) (Math.random() * 6)+1);

        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;
        int restoJres = bote_Jugador - 15;
        int restoJsum = bote_Jugador + 15;
        int restoMres = bote_Maquina - 15;
        int restoMsum = bote_Maquina = bote_Maquina + 15;
        int bancaPerder = banca + 15;
        int punto = 0;
        //TIRADA INICIAL
        if (totalPuntos_J > totalPuntos_M) {

            System.out.println("Empieza el jugador");

            if (totalPuntos_J == 7) {

                System.out.println("Lo siento. He ganado");
                turno = false;
            }

        } else if (totalPuntos_M > totalPuntos_J) {

            System.out.println("Empieza la maquina");
            /*Lo mismo con esto*/
            if (totalPuntos_M == 7) {
                System.out.println("HAS PERDIDO");
                turno = false;
            }

        }

        do {    //Bucle do gordo

            System.out.println("TIRADA DE SALIDA");
            System.out.println("-----------------------------------------");
            System.out.println("Banca: " + banca + " euros" + "\n"
                    + "Bote Maquina: " + bote_Maquina + " euros" + "\n"
                    + "Bote Jugador: " + bote_Jugador + " euros");

            System.out.println("Puntos Jugador : " + totalPuntos_J);
            System.out.println("Puntos Maquina : " + totalPuntos_M);

            //Se vuelven a tirar los dados
            dado1_Maquina = ((int) (Math.random() * 6) + 1);
            dado2_Maquina = ((int) (Math.random() * 6) + 1);
            totalPuntos_M = dado1_Maquina + dado2_Maquina;

            dado1_Jugador = ((int) (Math.random() * 6) + 1);
            dado2_jugador = ((int) (Math.random() * 6) + 1);
            totalPuntos_J = dado1_Jugador + dado2_jugador;

            if (totalPuntos_J == 7 || totalPuntos_J == 11) {
                System.out.println("Enhorabuena. Has ganado!!!");
                System.out.println("");
                System.out.println("Banca " + banca);
                System.out.println("Bote Maquina: " + restoMres + " euros");
                System.out.println("Bote Jugador: " + restoJsum + " euros");

            } else if (totalPuntos_J == 2 || totalPuntos_J == 3 || totalPuntos_J == 12) {
                System.out.println("Lo siento. He ganado");

                System.out.println("");
                System.out.println("Banca " + bancaPerder);
                System.out.println("Bote Maquina: " + restoJres + " euros");
                System.out.println("Bote Jugador: " + restoMsum + " euros");

            } else {
                punto = totalPuntos_J;

            }
            Noel();
            /*Creo que te compensaría más meter lo de abajo en un bucle do while y que lo haga hasta que se pierda*/

            System.out.print("Tirada de salida : " + punto);
            System.out.println(" Punto : " + punto);
            System.out.println("Tirada para el punto " + punto);
            System.out.println("Enhorabuena. Has ganado!!!");
            System.out.println("---------------------------------");

            System.out.println("Banca " + banca);
            System.out.println("Bote Maquina: " + restoJres + " euros");
            System.out.println("Bote Jugador: " + restoMsum + " euros");
            System.out.println("Continuamos jugando (S/N):");
            respuesta = teclado.nextLine().toUpperCase().trim().charAt(0);

            Noel();
            /*A esta condicion de salida llegan cosas que no están bien inicializadas*/
        } while (respuesta == 'S' && (restoJres > 15 || restoMsum > 15));

        System.out.println("GRACIAS POR JUGAR CONMIGO!!");

    }
}
