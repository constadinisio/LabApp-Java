package javaapplication15;

import java.util.*;

public class JavaApplication15 {

    public static void main(String[] args) {
        System.out.println("Escriba dos num");
        Scanner consta = new Scanner(System.in);
        int num1 = consta.nextInt();

        int num2 = consta.nextInt();

        if (num1 == num2) {
            System.out.println("son iguales");

        } else {
            System.out.println("no son iguales");
        }

    }
}
