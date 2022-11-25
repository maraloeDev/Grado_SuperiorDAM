
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

        int banca = 0;
        int bote_Maquina = 100;
        int bote_Jugador = 100;

        System.out.println("************************************\n"
                + "Juego de los dados\n"
                + "************************************");

        System.out.print("¿Te atreves a jugar contra mí? (S/N):");
        char respuesta = teclado.next().charAt(0);

        while (respuesta != 'S' && respuesta != 's' && respuesta != 'N' && respuesta != 'n') {
            System.out.println("Lo siento, no te he entendido bien, podrias repetirlo");
            System.out.println("¿Te atreves a jugar contra mí? (S/N):");
            respuesta = teclado.next().charAt(0);
        }
        System.out.println("Banca: " + banca + " euros" + "\n"
                + "Bote Máquina: " + bote_Maquina + " euros" + "\n"
                + "Bote Jugador: " + bote_Jugador + " euros");
        






































//        int dado_1_maquina = (int)(Math.random() *5) + 1;
        
        
//        int dado_2_maquina = (int)(Math.random() *5) + 1;
        //   System.out.println((int) (Math.random() * 5) + 1 + ((int) (Math.random() * 5) + 1));
        //   System.out.println(sumaDados_Maquina);
        //char respuesta = 'S';
//        do { //Realización del bucle do while para que cuando diga S
//            
//            
//
//            
//                    + "¿Te atreves a jugar contra mí? (S/N):");
//
//            respuesta = teclado.next().charAt(0);
//
//        } while (respuesta == 'S');
//        
//        while(respuesta!='S' || respuesta!='s' || respuesta!='N' || respuesta!='n'){
//            System.out.println("Lo siento, no te he entendido bien, podrias repetirlo");
//            System.out.println("¿Te atreves a jugar contra mí? (S/N):");
//            respuesta=teclado.next().charAt(0);
//            
//        }
//
//        System.out.print("Banca: \n " + banca + "\n"
//                + "Bote Maquina: \n" + bote_Maquina + "\n"
//                + "Bote Jugador: " + bote_Jugador);
    }

}
