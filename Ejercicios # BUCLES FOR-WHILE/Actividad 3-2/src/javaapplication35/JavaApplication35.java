package javaapplication35;
import java.util.*;

public class JavaApplication35 {

  public static void main(String[] args) {
      Scanner consta = new Scanner(System.in);
      System.out.println("Introduce un número:");
      byte numero = consta.nextByte();
      byte numeroInicial = numero;
      
    do {
      System.out.println("El número es " + (numeroInicial - numero + 1));
      numero--;
    } while (numero > 0);
  }
}