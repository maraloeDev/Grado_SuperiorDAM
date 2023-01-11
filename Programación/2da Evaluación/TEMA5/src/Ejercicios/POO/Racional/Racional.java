/** *****************************************************************************
 * Copyright (c) EDUARDO MARTÍN-SONSECA (maraloeDev)
 ***************************************************************************** */
package Ejercicios.POO.Racional;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Racional {

    //ATTRIBUTES
    private int numerador = 9;
    private int denomidador = 5;

    //CONSTRUCTOR
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denomidador = denominador;
    }

    //GETTER AND SETTER
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenomidador() {
        return denomidador;
    }

    public void setDenomidador(int denomidador) {
        this.denomidador = denomidador;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denomidador;
    }

    public Racional sumar(Racional r) {
        int sumaD = (this.denomidador + r.denomidador);
        int sumaN = (this.numerador + r.numerador);

        return simplifica(new Racional(sumaD, sumaN));
    }

    public Racional resta(Racional r) {
        int restaD = (this.denomidador - r.denomidador);
        int restaN = (this.numerador - r.numerador);
        return simplifica(new Racional(restaD, restaN));
    }

    public Racional producto(Racional r) {
        int productoD = (this.denomidador - r.denomidador);
        int productoN = (this.numerador - r.numerador);
        return simplifica(new Racional(productoD, productoN));
    }

    public Racional dividir(Racional r) {
        int dividirD = (this.denomidador - r.denomidador);
        int dividirN = (this.numerador - r.numerador);
        return simplifica(new Racional(dividirD, dividirN));
    }

    public double toDecimal() {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.setMaximumFractionDigits(2);
        return Double.parseDouble(nf.format((double) this.numerador / (double) this.denomidador));
    }

    private Racional simplificado(Racional r) {

        int simplifica1 = this.numerador / r.denomidador;
        int simplifica2 = this.numerador / r.denomidador;

        int total = (numerador * this.denomidador) + (this.denomidador * numerador);

        int totalDivision = (this.denomidador + r.denomidador) / total;
        return r;
    }

    public boolean toEquals(Racional r) {

        if (r.equals(r.denomidador) && (r.equals(r.numerador))) {
            return true;
        } else {
            return false;
        }
    }

    public void compareTo(Racional r) {

        if ((r.denomidador > this.denomidador) && (r.numerador > this.numerador)) {

        } else if ((r.numerador < r.denomidador) && (r.denomidador > this.denomidador)) {

        } else if ((r.numerador == this.numerador) && (r.denomidador == this.denomidador)) {

        }
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
        int mcd = MCD(Math.abs(r.numerador), Math.abs(r.denomidador));
        int num = r.numerador / mcd;
        int den = r.denomidador / mcd;
        return new Racional(num, den);
    }

}
