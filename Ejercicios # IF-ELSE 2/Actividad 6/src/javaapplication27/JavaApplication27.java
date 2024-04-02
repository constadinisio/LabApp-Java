package javaapplication27;
import java.util.*;

public class JavaApplication27 {
    public static void main(String[] args) {
        Scanner consta=new Scanner(System.in);
        System.out.println("Escriba su edad");
        int edadPersona = consta.nextInt();
        
        if(edadPersona <= 4) {
            System.out.println("No es necesario pagar. Entra GRATIS");
        } if(edadPersona > 4 && edadPersona < 18) {
            System.out.println("Debera pagar 5€");
        } else {
            System.out.println("Debera pagar 10€");
        }
    }
    
}