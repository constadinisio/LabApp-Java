package javaapplication33;

import java.util.*;

public class JavaApplication33 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int numeroInicial = consta.nextInt();
        
        for (int x = numeroInicial; x > 0; x--) {
            System.out.print(x + "\n");
        }
        System.out.println();
    }
}