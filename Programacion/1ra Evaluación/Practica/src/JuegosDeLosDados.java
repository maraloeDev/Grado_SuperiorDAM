
import java.util.Random;
import java.util.Scanner;
import javax.naming.ldap.Rdn;
//CAMBIAR LOS DO POR IF

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author Eduardo Martin-Sonseca
 */
public class JuegosDeLosDados {

    //Bucle do-while, donde si se introduce otra cosa que no sea (S o N)
    //Lo vuelve a repetir
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random rndm = new Random();
        //Tirada de dados de la maquina y la suma de dados
        //Generación aleatoria con el objeto Random

        int suma_Dados_Maquina = rndm.nextInt(1, 7)
                + rndm.nextInt(1, 7);

        //Tirada de dados del jugador y la suma de dados
        int suma_Dados_Jugador = rndm.nextInt(1, 7)
                + rndm.nextInt(1, 7);

        char respuesta;

        int banca = 0; //Banca inicial
        int boteMaquina = 100; //bote inicial de la maquina
        int boteJugador = 100; //bote inicial del jugador

        suma_Dados_Maquina = rndm.nextInt(1, 7)
                + rndm.nextInt(1, 7);

        suma_Dados_Jugador = rndm.nextInt(1, 7)
                + rndm.nextInt(1, 7);

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************\n"
                + "Te atreves a jugar contra mí (S/N):");
        respuesta = teclado.next().toUpperCase().trim().charAt(0);

        //Tirada de salida //AQUI PUEDE HABER UN DO
        System.out.println("Banca: " + banca + "\n"
                + "Bote Maquina: " + boteMaquina + "\n"
                + "Bote Jugador: " + boteJugador);
        System.out.println("Empieza la partida el que saque más puntos");
        System.out.println("Puntos Jugador:\n" + suma_Dados_Jugador
                + "\n" + "Puntos Maquina: " + suma_Dados_Maquina);

        do {
            //Si gana la maquina, vuelve a tirar
            if (suma_Dados_Maquina > suma_Dados_Jugador) {
                
                suma_Dados_Maquina = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                suma_Dados_Jugador = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                System.out.println("Puntos Jugador:\n" + suma_Dados_Jugador
                        + "\n" + "Puntos Maquina: " + suma_Dados_Maquina);

                System.out.println("EMPIEZA LA MAQUINA");
                System.out.println("Lo siento. He ganado");

                System.out.println("Banca: " + (banca + 15) + " euros"
                        + "\n" + "Bote Máquina: " + (boteMaquina + 15) + " euros"
                        + "\n" + "Bote Jugador: " + (boteJugador - 15) + " euros");

                System.out.println("Continuamos jugando (S/N):");
                respuesta = teclado.next().toUpperCase().trim().charAt(0);

            } else if (suma_Dados_Jugador > suma_Dados_Maquina) {

                //Si gana la jugador, vuelve a tirar
                suma_Dados_Maquina = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                suma_Dados_Jugador = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                System.out.println("Puntos Jugador:\n" + suma_Dados_Jugador
                        + "\n" + "Puntos Maquina: " + suma_Dados_Maquina);

                System.out.println("EMPIEZA EL JUGADOR");
                System.out.println("Enhorabuena. Has ganado");

                System.out.println("Banca: " + (banca + 15) + " euros"
                        + "\n" + "Bote Máquina: " + (boteMaquina - 15) + " euros"
                        + "\n" + "Bote Jugador: " + (boteJugador + 15) + " euros");

                System.out.println("Continuamos jugando (S/N):");
                respuesta = teclado.next().toUpperCase().trim().charAt(0);

            } else if (suma_Dados_Maquina == suma_Dados_Jugador) {

                suma_Dados_Maquina = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                suma_Dados_Jugador = rndm.nextInt(1, 7)
                        + rndm.nextInt(1, 7);

                System.out.println("EMPATE!!");

                System.out.println("Puntos Jugador:\n" + suma_Dados_Jugador
                        + "\n" + "Puntos Maquina: " + suma_Dados_Maquina);

                System.out.println("Banca: " + (banca + 15) + " euros"
                        + "\n" + "Bote Máquina: " + (boteMaquina + 15) + " euros"
                        + "\n" + "Bote Jugador: " + (boteJugador - 15) + " euros");

                System.out.println("Continuamos jugando (S/N):");
                respuesta = teclado.next().toUpperCase().trim().charAt(0);
            }
        } while (respuesta == 'S');

        System.out.println("GRACIAS POR JUGAR CONMIGO!!");
    }
}
