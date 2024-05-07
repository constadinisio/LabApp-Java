/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°4 - DO WHILE
    
    CÓDIGO FUNCIONANDO.
*/

package javaapplication45;

public class JavaApplication45 {

    public static void main(String[] args) {
        int x = 100;

        do {
            if (x > 0) {
                System.out.println("El número es " + x);
                x = x - 23;

            }
        } while (x >= 0);
    }
}
