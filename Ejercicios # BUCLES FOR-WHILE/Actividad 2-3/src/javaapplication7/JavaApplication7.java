package javaapplication7;
import java.util.*;

public class JavaApplication7{

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = consta.nextInt();
        
        for (int x = 1; x <= numero; x++) {
            System.out.println("El número es " + x);
        }
    }
}
