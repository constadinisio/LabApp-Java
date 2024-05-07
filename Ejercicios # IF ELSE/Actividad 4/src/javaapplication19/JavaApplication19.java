package javaapplication19;

import java.util.*;

public class JavaApplication19 {

    public static void main(String[] args) {
        System.out.println("Escriba un numero entero");
        Scanner consta = new Scanner(System.in);
        int numEntero = consta.nextInt();
        if (numEntero % 3 == 0 && numEntero % 5 == 0) {
            System.out.println("El numero es multiplo de 3 y 5");
        } else {
            System.out.println("El numero entero especificado no es multiplo de 3 y de 5");
        }
    }
}
