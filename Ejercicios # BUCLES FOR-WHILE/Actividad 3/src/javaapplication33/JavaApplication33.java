package javaapplication33;

import java.util.*;

public class JavaApplication33 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        int numeroInicial = consta.nextInt();
        
        for (int x = numeroInicial; x >= 1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}