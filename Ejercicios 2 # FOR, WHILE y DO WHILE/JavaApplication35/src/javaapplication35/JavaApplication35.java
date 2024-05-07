/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°2 - FOR
    
    CÓDIGO FUNCIONANDO.
*/

package javaapplication35;

import java.util.*;

public class JavaApplication35 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int resultado = 1;
        System.out.println("Ingrese una base para hacer el calculo...");
        int base = consta.nextInt();
        System.out.println("Ingrese una base para hacer el calculo...");
        int exponente = consta.nextInt();

        for (int x = 0; x < exponente; x++) {
            resultado *= base;
        }
        
        System.out.println("El resultado de la potencia es: " + resultado);
    }

}
