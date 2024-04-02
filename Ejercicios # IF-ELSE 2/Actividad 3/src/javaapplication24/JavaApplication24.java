package javaapplication24;

import java.util.*;

public class JavaApplication24 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduzca su dividendo");
        int dividendoNumero = consta.nextInt();
        System.out.println("Introduzca su divisor");
        int divisorNumero = consta.nextInt();

        if (divisorNumero == 0) {
            System.out.println("ERROR! El divisor es igual a 0");
        } else {
            double valorFinal = (dividendoNumero / divisorNumero);
            System.out.println("El valor final de la division es: " + valorFinal);
        }
    }
}
