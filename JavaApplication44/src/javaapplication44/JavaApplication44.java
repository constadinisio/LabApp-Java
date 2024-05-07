/* 
    EJERCITACIÓN 2 # BUCLES (FOR & WHILE & DO-WHILE)
    CONSTANTINO DI NISIO 
    LAB. DE DESAROLLO DE APLICACIÓNES
    
    ACTIVIDAD N°4 - WHILE
    
    CÓDIGO FUNCIONANDO.
*/

package javaapplication44;

public class JavaApplication44 {

  public static void main(String[] args) {
    int x = 100;

    while (x >= 0) {
      if (x > 0) {
        System.out.println("El número es " + x);
        x = x - 23;
      }
    }
  }
}