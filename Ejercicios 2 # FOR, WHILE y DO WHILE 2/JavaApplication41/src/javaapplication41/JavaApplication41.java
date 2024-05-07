/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°3 - WHILE
    
    CÓDIGO FUNCIONANDO.
*/


package javaapplication41;

import java.util.*;

public class JavaApplication41 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int pagoMensual = 10;
        int totalMeses = 20;
        int i = 1;
        
        while(i <= totalMeses) {
             pagoMensual = pagoMensual + pagoMensual;
            System.out.println("Resultado: " + pagoMensual);
            i++;
        }
    }

}
