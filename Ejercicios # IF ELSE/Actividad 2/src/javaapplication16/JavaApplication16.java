package javaapplication16;

import java.util.*;

public class JavaApplication16 {

    public static void main(String[] args) {
        System.out.println("Escriba dos numeros");
        Scanner hola = new Scanner(System.in);

        int num1 = hola.nextInt();
        System.out.println("Escriba el otro numero");
        int num2 = hola.nextInt();

        if (num1 > num2) {
            System.out.println("El " + num1 + " es mayor al " + num2);

        } else if (num2 > num1) {
            System.out.println("El " + num2 + " es mayor al " + num1);

        } else {
            System.out.println("Los numeros son iguales");

        }
    }
}
