package javaapplication21;

import java.util.*;

public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Escriba su calificacion del 1-10");
        int calificacionFinal = consta.nextInt();
        if (calificacionFinal <= 5) {
            System.out.println("Insuficiente");
        } else {
            if (calificacionFinal == 6) {
                System.out.println("Suficiente");
            } else {
                if (calificacionFinal == 7) {
                    System.out.println("Bien");
                } else {
                    if (calificacionFinal <= 9) {
                        System.out.println("Notable");
                    } else {
                        if (calificacionFinal == 10) {
                            System.out.println("Sobresaliente");
                        }
                    }
                }
            }
        }
    }
}
