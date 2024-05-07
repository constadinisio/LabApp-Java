package javaapplication17;

import java.util.*;

public class JavaApplication17 {

    public static void main(String[] args) {
        System.out.println("Escriba dos numeros");
        Scanner consta = new Scanner(System.in);
        int num1 = consta.nextInt();
        int num2 = consta.nextInt();

        if (num1 % 10 == num2 % 10) {
            System.out.println("La ultima cifra de los numeros son iguales.");

        } else {
            System.out.println("La ultima cifra de los numeros no son iguales.");
        }
    }

}
