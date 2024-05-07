package javaapplication26;

import java.util.*;

public class JavaApplication26 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int dineroReal = 2400;
        System.out.println("Escriba su puntuación");
        double puntuacionNota = consta.nextDouble();

        if (puntuacionNota == 0.0) {
            System.out.println("Su puntuación es de 0.0. Su nivel de rendimiento es Inaceptable. Su cantidad de dinero es de 2400€");
        }
        if (puntuacionNota == 0.4) {
            double dineroSuma = (dineroReal * puntuacionNota);
            double dineroFinal = (dineroSuma + dineroReal);
            System.out.println("Su puntuación es de 0.4. Su nivel de rendimiento es Aceptable. Su cantidad de dinero es de " + dineroFinal + "€");
        }
        if (puntuacionNota >= 0.6) {
            double dineroSuma = (dineroReal * puntuacionNota);
            double dineroFinal = (dineroSuma + dineroReal);
            System.out.println("Su puntuación es de 0.6. Su nivel de rendimiento es Meritorio. Su cantidad de dinero es de " + dineroFinal + "€");
        }
    }
}
