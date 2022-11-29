
import java.util.Random;
import java.util.Scanner;
import javax.naming.ldap.Rdn;


/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
/**
 *
 * @author maraloed
 */
public class Practca_1_Juego_De_Dados {
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        char respuesta = teclado.next().toUpperCase().trim().charAt(0);
        
        Random rndm=new Random();
        int sumaDados_Jugador=rndm.nextInt(1,6);
        int sumaDados_Maquina=rndm.nextInt(1,6);
        System.out.println(sumaDados_Jugador);
        System.out.println(sumaDados_Maquina);
    }
    
}
