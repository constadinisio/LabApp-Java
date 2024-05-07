/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°3 - FOR
    
    CÓDIGO FUNCIONANDO.
 */


package javaapplication40;

import java.util.*;

public class JavaApplication40 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        int pagoMensual = 10;
        int totalMeses = 20;

        for (int i = 1; i <= totalMeses; i++) {
            pagoMensual = pagoMensual + pagoMensual;
            System.out.println("Resultado: " + pagoMensual);
        }
    }
}
