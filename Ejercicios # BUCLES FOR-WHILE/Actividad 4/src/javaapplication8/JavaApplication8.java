package javaapplication8;

import java.util.*;

public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int primerNumero;
        int segundoNumero;
        
        do {
            System.out.println("Introduzca dos numeros enteros:");
           primerNumero = consta.nextInt();
           segundoNumero = consta.nextInt();
           
           if(primerNumero == segundoNumero) {
               System.out.println("Los numeros son iguales, vuelva a introducirlos:");
           }
        } while (primerNumero == segundoNumero);
        
            for (int x = primerNumero; x <= segundoNumero; x++) {
            System.out.println("El número es " + x);
        }
    }
}