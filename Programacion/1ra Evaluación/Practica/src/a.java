
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTiN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;
        boolean turno = true; //Si es true empieza el jugador, en caso contrario la maquina
        boolean resultado = true; //Si es true hay un resultado y en caso contario, no lo hay
        int punto = 0;

        System.out.print("************************************\n"
                + "Juego de los dados\n"
                + "************************************\n"
                + "�Te atreves a jugar contra m�? (S/N):");

        char respuesta = teclado.next().toUpperCase().trim().charAt(0);

        int dados_Jugador;
        int dados_Maquina;

        do { //turnos
            dados_Jugador = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
            dados_Maquina = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;

            turno = dados_Jugador > dados_Maquina; // Comprobacion de los turnos
            if (dados_Jugador == dados_Maquina) {

                System.out.println("EMPATE!!!");
            }
            System.out.println("Dado J : " + dados_Jugador);
            System.out.println("Dado M : " + dados_Maquina);

            System.out.println("Banca: " + banca + "\n"
                    + "Bote Maquina: " + bote_Maquina + "\n"
                    + "Bote Jugador: " + bote_Jugador + "\n"
                    + "Empieza la partida el que saque mas puntos...");

        } while (dados_Jugador == dados_Maquina);
        //Mientras que los puntos del jugador sea igual a la de a maquina, 
        //Se vuelve a tirar

        do {
            do {
                //EMPIEZA EL JUGADOR
                if (turno == true) {
                    dados_Jugador = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;

                    System.out.println("EMPIEZA EL JUGADOR...");
                    System.out.println("");

                    System.out.println("Juegas...");
                    //tirada se salida
                    System.out.print("Tirada de salida : " + dados_Jugador);
                    if (dados_Jugador == 7 || dados_Jugador == 11) {
                        System.out.println("Enhorabuena. Has ganado!!!");
                        bote_Maquina = bote_Maquina - 15;
                        bote_Jugador = bote_Jugador + 15;

                    } else if (dados_Jugador == 2 || dados_Jugador == 3 || dados_Jugador == 12) {
                        System.out.println("Lo siento has perdido");

                    } else {
                        System.out.println("\tPunto:" + dados_Jugador);

                        do {
                            resultado = true;
                            punto = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
                            System.out.println("Tirada para el punto: " + punto);
                            if (punto == 7) {
                                System.out.println("Has perdido");
                                turno = false;
                                banca = banca + 15;
                                bote_Jugador = bote_Jugador - 15;

                            } else if (punto == dados_Jugador) {
                                System.out.println("Has ganado");
                                bote_Maquina = bote_Maquina - 15;
                                bote_Jugador = bote_Jugador + 15;

                            } else {
                                resultado = false;

                            }
                        } while (resultado == false);

                    }

                }
                System.out.println("Banca: " + banca + "\n"
                        + "Bote M�quina: " + (bote_Maquina) + "\n"
                        + "Bote Jugador: " + (bote_Jugador));

            } while (turno);

            do {
                //EMPIEZA LA MAQUINA
                if (turno == false) {
                    dados_Maquina = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;

                    System.out.println("EMPIEZA LA MAQUINA...");
                    System.out.println("");

                    System.out.println("Juego...");
                    //tirada se salida
                    System.out.print("Tirada de salida : " + dados_Maquina);
                    if (dados_Maquina == 7 || dados_Maquina == 11) {
                        System.out.println("SUIIIIIIIIIIII HE GANADO!!!");
                        bote_Maquina = bote_Maquina + 15;
                        bote_Jugador = bote_Jugador - 15;

                    } else if (dados_Maquina == 2 || dados_Maquina == 3 || dados_Maquina == 12) {
                        System.out.println("He perdido");

                    } else {
                        System.out.println("\tPunto:" + dados_Maquina);

                        do {
                            resultado = true;
                            punto = (int) (Math.random() * 6) + 1 + (int) (Math.random() * 6) + 1;
                            System.out.println("Tirada para el punto: " + punto);
                            if (punto == 7) {
                                System.out.println("He perdido");
                                turno = false;
                                banca = banca + 15;
                                bote_Maquina = bote_Maquina - 15;

                            } else if (punto == dados_Maquina) {
                                System.out.println("He ganado");
                                bote_Maquina = bote_Maquina + 15;
                                bote_Jugador = bote_Jugador - 15;

                            } else {
                                resultado = false;

                            }
                        } while (resultado == false);

                    }

                }
                System.out.println("Banca: " + banca + "\n"
                        + "Bote M�quina: " + (bote_Maquina) + "\n"
                        + "Bote Jugador: " + (bote_Jugador));

            } while (turno);

            System.out.println("Continuamos jugando (S o N) ");
            respuesta = teclado.next().toUpperCase().trim().charAt(0);

        } while (respuesta == 'S' && bote_Jugador >= 15 && bote_Maquina >= 15);
        System.out.println("GRACIAS POR JUGAR CONMIGO!!!");

    }
}
