package javaapplication25;

import java.util.*;

public class JavaApplication25 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edadPersona = consta.nextInt();
        System.out.println("Introduzca sus ingresos mensuales");
        int ingresoMensual = consta.nextInt();

        if (edadPersona >= 16 && ingresoMensual >= 1000) {
            System.out.println("Podes tributar");
        } else {
            System.out.println("No podes tributar");
        }
    }
}
