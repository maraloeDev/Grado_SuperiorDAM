package EjerciciosPropuestos;

import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio_2_IVA {

    static  Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una cantidad en euros ");
    int cantidad = teclado.nextInt();
    double G = (int)(cantidad / 1.21);
    double R = (int)(cantidad * 1.10);
    double S = (int)(cantidad * 1.4);

        System.out.println("--------------");

        System.out.println("Introduce el tipo de IVA " + "\n" +
                " G: 21% " + "\n" +
                " R: 10% " + "\n" +
                " S: 4% ");
        String eleccion = teclado.next();

        switch (eleccion){

            case "G":
                System.out.println("BI : " + cantidad + "\n"+
                                    "IVA : " + G);
                break;
            case "R":
                System.out.println("BI : " + cantidad + "\n"+
                        "IVA : " + R);
                break;
            case "S":
                System.out.println("BI : " + cantidad + "\n"+
                        "IVA : " + S);
                break;
            default:
                System.out.println("Numero no contenplado ");
        }




    }
}
