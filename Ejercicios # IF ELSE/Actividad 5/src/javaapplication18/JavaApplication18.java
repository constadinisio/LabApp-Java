package javaapplication18;

import java.util.*;

public class JavaApplication18 {

    public static void main(String[] args) {
        System.out.println("Escriba un año");
        Scanner consta = new Scanner(System.in);
        int anio = consta.nextInt();
        if (anio % 4 == 0) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
