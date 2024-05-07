package javaapplication20;

import java.util.*;

public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        int primerNumero = consta.nextInt();
        System.out.println("Escriba el segundo numero");
        int segundoNumero = consta.nextInt();
        System.out.println("Escriba el tercer numero");
        int tercerNumero = consta.nextInt();

        if (primerNumero > tercerNumero && primerNumero > segundoNumero) {
            System.out.println("El primer numero es el mayor");
        } else {
            if (segundoNumero > tercerNumero && segundoNumero > primerNumero) {
                System.out.println("El segundo numero es el mayor");
            } else {
                System.out.println("El tercer numero es el mayor");
            }
        }
    }
}
