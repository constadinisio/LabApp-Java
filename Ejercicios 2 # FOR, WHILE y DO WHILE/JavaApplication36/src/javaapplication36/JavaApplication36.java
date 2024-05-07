/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°2 - WHILE
    
    CÓDIGO FUNCIONANDO.
*/


package javaapplication36;

import java.util.*;

public class JavaApplication36 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int resultado = 1;
        int i = 1;
        
        System.out.println("Ingrese una base para hacer el calculo...");
        int base = consta.nextInt();
        System.out.println("Ingrese un exponente para hacer el calculo...");
        int exponente = consta.nextInt();
        
        int veces = exponente;

        while (i <= veces) {
            if (i <= exponente) {
                resultado *= base;
            } else if (base < 0) {
                    System.out.println("No se puede poner una base menor que 0...");
            }
                i++;
        }
        System.out.println("El resultado de la potencia es: " + resultado);
    }
}