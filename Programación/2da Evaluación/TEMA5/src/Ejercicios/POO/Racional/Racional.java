package Ejercicios.POO.Racional;



import java.text.NumberFormat;
import java.util.Locale;

public class Racional {

    // Atributos
    private int numerador;
    private int denominador;

    // Constructor por defecto


    //Constructor parametrizado
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Metodos getter y setter
    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    // Metodos de utilidad
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public double toDecimal() {
        NumberFormat nf=NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        return Double.parseDouble(nf.format((double)this.numerador / (double)this.denominador));
    }

    /*
     * SUMA DE 2 RACIONALES:
     */

    public Racional Relacional(Racional r){
        int new_numerador=this.numerador*r.denominador + this.denominador*r.numerador;
        int new_denominador=this.denominador*r.denominador;
        return simplifica(new Racional(new_numerador,new_denominador));
    }

    public Racional resta(Racional r) {
        int new_numerador=this.numerador*r.denominador - this.denominador*r.numerador;
        int new_denominador=this.denominador*r.denominador;
        return simplifica(new Racional(new_numerador,new_denominador));
    }

    /*
     * PRODUCTO DE 2 RACIONALES:
     */
    public Racional producto(Racional r) {
        int num = this.numerador * r.numerador;
        int den = this.denominador * r.denominador;
        return simplifica(new Racional(num, den));
    }

    /*
     * COCIENTE DE 2 RACIONALES:
     */
    public Racional division(Racional r) {
        int num = this.numerador * r.denominador;
        int den = this.denominador * r.numerador;
        return simplifica(new Racional(num, den));
    }

    private int MCD(int n1, int n2) {

        int resto;
        int aux;

        do {
            resto = n1 % n2;

            if (resto != 0) {
                aux = n2;
                n2 = resto;
                n1 = aux;
            }

        } while (resto != 0);

        return n2;

    }

    private Racional simplifica(Racional r) {
        int mcd = MCD(Math.abs(r.numerador), Math.abs(r.denominador));
        int num = r.numerador / mcd;
        int den = r.denominador / mcd;
        return new Racional(num, den);
    }
}

