package ejercicio_12_4;

import java.util.Random;
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev) // do { //
 *
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dados_Jugador = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
        int dados_Maquina = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;
        boolean turno = true;
        int punto = 0;

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************\n"
                + "¿Te atreves a jugar contra mí? (S/N):");

        char respuesta = teclado.next().toUpperCase().trim().charAt(0);
        while (respuesta == 'S') {
            do{
            System.out.println("Banca: " + banca + "\n"
                    + "Bote Maquina: " + bote_Maquina + "\n"
                    + "Bote Jugador: " + bote_Jugador + "\n"
                    + "Empieza la partida el que saque mas puntos...");

            //Si quedan empate, vuelven los 2 jugadores a tirar los dados
            dados_Jugador = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
            dados_Maquina = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;

            if (dados_Jugador == dados_Maquina) {
                System.out.println("EMPATE, volvamos a tirar");
                System.out.println("");
                System.out.println("Puntos Jugador " + dados_Jugador);
                System.out.println("Puntos Maquina " + dados_Maquina);

            }

            turno = dados_Jugador > dados_Maquina;

        }
        while (dados_Jugador == dados_Maquina);
        //Mientras que los puntos del jugador sea igual a la de a maquina, 
        //Se vuelve a tirar

        System.out.println("--------------------------------------------------");

        System.out.println("Puntos Jugador " + dados_Jugador);
        System.out.println("Puntos Maquina " + dados_Maquina);
        do {
            do {
                //EMPIEZA EL JUGADOR
                if (dados_Jugador > dados_Maquina) {

                    System.out.println("EMPIEZA EL JUGADOR...");
                    System.out.println("");

                    System.out.println("Juegas...");

                    if (dados_Jugador == 7 || dados_Jugador == 11) {
                        System.out.println("Enhorabuena. Has ganado!!!");
                        bote_Maquina = bote_Maquina - 15;
                        bote_Jugador = bote_Jugador + 15;

                        System.out.println("Banca: " + banca + "\n"
                                + "Bote Máquina: " + (bote_Maquina) + "\n"
                                + "Bote Jugador: " + (bote_Jugador));

                    } else if (dados_Jugador == 2 || dados_Jugador == 3 || dados_Jugador == 12) {
                        System.out.println("Lo siento has perdido");

                    } else if (dados_Jugador == 4 || dados_Jugador == 5 || dados_Jugador == 6
                            || dados_Jugador == 8 || dados_Jugador == 9 || dados_Jugador == 10) {

                        punto = dados_Jugador;
                    } else if (dados_Jugador == punto || dados_Jugador == 7) {
                        System.out.println("Enhorabuena. Has ganado!!!");
                    }

                    System.out.println("Tirada de salida : " + punto + "\t" + "Punto: " + punto);
                    System.out.println("Tirada para el punto: " + punto);

                }

            } while (dados_Jugador > dados_Maquina);

            do {
                //EMPIEZA LA MAQUINA
                if (dados_Maquina > dados_Jugador) {
                    System.out.println("Puntos Jugador " + dados_Jugador);
                    System.out.println("Puntos Maquina " + dados_Maquina);
                    System.out.println("EMPIEZA LA MAQUINA...");
                    bote_Maquina = bote_Maquina + 15;
                    bote_Jugador = bote_Jugador - 15;
                    System.out.println("Banca:" + banca + "\n"
                            + "Bote Máquina:  " + (bote_Maquina) + "\n"
                            + "Bote Jugador: " + (bote_Jugador));
                    System.out.println("");

                    System.out.println("Juego...");

                    if (dados_Maquina == 7 || dados_Maquina == 11) {
                        System.out.println("LO SIENTO. HE GANADO!!!");

                    } else if (dados_Maquina == 2 || dados_Maquina == 3 || dados_Maquina == 12) {
                        System.out.println("Lo siento has perdido");

                    } else if (dados_Maquina == 4 || dados_Maquina == 5 || dados_Maquina == 6
                            || dados_Maquina == 8 || dados_Maquina == 9 || dados_Maquina == 10) {

                        punto = dados_Maquina;
                    } else if (dados_Maquina == punto || dados_Maquina == 7) {
                        System.out.println("Enhorabuena. Has ganado!!!");
                    }

                    System.out.println("Tirada de salida : " + punto + "\t" + "Punto: " + punto);
                    System.out.println("Tirada para el punto: " + punto);

                }
                System.out.println("Continuamos jugando (S o N) ");
                respuesta = teclado.next().toUpperCase().trim().charAt(0);
            } while (dados_Maquina > dados_Jugador);

            System.out.println("Continuamos jugando (S o N) ");
            respuesta = teclado.next().toUpperCase().trim().charAt(0);

        } while (respuesta == 'S');
        System.out.println("GRACIAS POR JUGAR CONMIGO!!!");

    }
    }
}