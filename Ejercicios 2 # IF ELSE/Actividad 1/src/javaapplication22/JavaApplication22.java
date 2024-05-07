package javaapplication22;

import java.util.*;

public class JavaApplication22 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edadPersona = consta.nextInt();

        if (edadPersona >= 18) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }
    }
}
