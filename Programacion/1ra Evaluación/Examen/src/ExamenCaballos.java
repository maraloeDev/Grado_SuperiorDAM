
import java.util.Scanner;


/** *****************************************************************************
 * Copyright (C) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
/**
 *
 * @author maraloed
 */
public class ExamenCaballos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        String caballo1="";
        String caballo2="";
        System.out.print("Nombre de usuario: ");
        String nombre;
        
        nombre=teclado.nextLine();
        int contador = 0;
        
        for (int i = 0; i < nombre.length(); i++) {
            char letra= nombre.charAt(0);
            contador = contador + letra;
            contador++;
            
        }
        System.out.println(caballo1);
        System.out.println(caballo2);
        System.out.println("Meta en : " + contador);
        int caballoAleatorio = (int) (Math.random() * 10);
        
        do {
            
            if(caballoAleatorio > 5){
                caballo1+="1";
            } else{
                caballo2+="2";
            }
            
            if ( caballo1.length()==contador){
                System.out.println("Ha ganado el caballo 1");
            } else if (caballo2.length()==contador){
                System.out.println("Ha ganado el caballo 2");
            }
            
        } while (caballo1.length() <contador && caballo2.length() < contador);
        
    }
    
}
