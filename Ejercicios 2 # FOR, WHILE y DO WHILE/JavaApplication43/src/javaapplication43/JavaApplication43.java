/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°4 - FOR
    
    CÓDIGO FUNCIONANDO.
*/

package javaapplication43;

public class JavaApplication43 {

    public static void main(String[] args) {
        int x;

        for (x = 100; x != 0; ) {
            if (x > 0) {
                System.out.println("El número es " + x);
                x = x - 23;
            }
        }
    }
}
