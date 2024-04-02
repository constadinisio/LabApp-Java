package javaapplication9;

import java.util.*;

public class JavaApplication9 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int numeroA;
        int numeroB;

        do {
            System.out.println("Introduzca dos numeros enteros:");
            numeroA = consta.nextInt();
            numeroB = consta.nextInt();

            if (numeroA > numeroB) {
                System.out.println("numeroA es menor que numeroB, vuelva a introducirlos:");
            }

        } while (numeroA > numeroB);

            for (int i = numeroA; i <= numeroB; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}