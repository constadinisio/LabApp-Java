package javaapplication11;
import java.util.*;

public class JavaApplication11 {

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

        System.out.println("Multiplos de " + numeroA + " entre 1 y " + numeroB + ":");
        for (int i = 1; i <= numeroB; i++) {
            if (i % numeroA == 0) {
                System.out.print(i + " ");
                System.out.println();
            }
        }
    }
}
