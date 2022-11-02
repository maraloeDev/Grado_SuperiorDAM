
/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloed)
 ***************************************************************************** */
import java.util.Scanner;

public class clase {

    /**
     * Imprimir las letras de una frase introducida por teclado de una forma
     * alternativa, es decir,una de la parte final y la siguiente de la inicial,
     * hasta recorrer todos los caracteres de la misma.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase :");
        String texto = teclado.nextLine();
//        int contador = 0; // Es la variable que avanza hacia delante
//        int fraseinicial = texto.length(); // Es la variable que avanza hacia

//        while (contador != fraseinicial) {
//            System.out.println(texto.charAt(contador));
//            contador++;
//            if (contador != fraseinicial) {
//                System.out.println(texto.charAt(fraseinicial - 1));
//                fraseinicial--;
//            }
//        }
//        int contador = 0;
//        do {
//
//            System.out.println(texto.substring(contador, contador + 1));
//            System.out.println(texto.substring(texto.length() - contador - 1, texto.length() - contador));
//            contador++;
//
//        } while (contador < texto.length() / 2);

    }

}
