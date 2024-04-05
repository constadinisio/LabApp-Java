package javaapplication34;
import java.util.*;

public class JavaApplication34 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduce un número:");
        byte numero = consta.nextByte();
        byte numeroInicial = numero;

        while (numero > 0) {
            System.out.println("El número es " + (numeroInicial - numero + 1));
            numero--;
        }
    }
}