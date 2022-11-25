
import java.util.Scanner;

/**
 * *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 * ****************************************************************************
 */
/**
 *
 * @author maraloed
 */
public class Juego_De_Los_Dados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*************** ALEATORIO Y TOTAL DE LA MAQUINA*//******/
int dado1_Maquina= ((int) (Math.random() * 5)); 
int dado2_Maquina= ((int) (Math.random() * 5));
int totalPuntos_M=dado1_Maquina + dado2_Maquina;

//int tpm= ((int) (Math.random() * 5))+ ((int) (Math.random() * 5));

/*************** ALEATORIO Y TOTAL DEL JUGADOR*//******/
int dado1_Jugador= ((int) (Math.random() * 5));
int dado2_jugador= ((int) (Math.random() * 5));
int totalPuntos_J=dado1_Jugador + dado2_jugador;
//int tpj= ((int) (Math.random() * 5))+ ((int) (Math.random() * 5));

        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;
        int punto=0 ;

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************");

        System.out.print("¿Te atreves a jugar contra mí? (S/N):");
        char respuesta = teclado.nextLine().charAt(0);

        while (respuesta != 'S' && respuesta != 's' && respuesta != 'N' && respuesta != 'n') {
            System.out.println("Lo siento, no te he entendido bien, podrias repetirlo");
            System.out.println("¿Te atreves a jugar contra mí? (S/N):");
            respuesta = teclado.next().charAt(0);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Banca: " + banca + " euros" + "\n"
                + "Bote Máquina: " + bote_Maquina + " euros" + "\n"
                + "Bote Jugador: " + bote_Jugador + " euros");

        System.out.println("Empieza la partida el que saque mas puntos...");

        System.out.println("Puntos del jugador : " + totalPuntos_J);
        System.out.println("Puntos de la maquina : " + totalPuntos_M);
        System.out.println("Empiezas");
        System.out.println("");
        System.out.println("Juegas...");
        System.out.println("Tirada de salida : " + punto );
        System.out.print("Punto : " + punto);
        
        
        if (totalPuntos_J == 7 || totalPuntos_J == 11){
            System.out.println("Enhorabuena. Has ganado!!!");
            
        } else if (totalPuntos_J ==2 || totalPuntos_J == 3 || totalPuntos_J == 12){
            System.out.println("Lo siento, has perdido");
        } else if (totalPuntos_J == 4 || totalPuntos_J == 5 || totalPuntos_J == 6 || totalPuntos_J == 8 || totalPuntos_J == 9 || totalPuntos_J == 10){
            punto = totalPuntos_J;
        }
    }

}
