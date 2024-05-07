/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°3 - DO WHILE
    
    CÓDIGO FUNCIONANDO.
*/


package javaapplication42;

import java.util.*;

public class JavaApplication42 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int pagoMensual = 10;
        int totalMeses = 20;
        int i = 1;
        
        do {
             pagoMensual = pagoMensual + pagoMensual;
            System.out.println("Resultado: " + pagoMensual);
            i++;
        } while(i <= totalMeses);
    }

}
