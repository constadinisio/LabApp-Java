package javaapplication28;

import java.util.*;

public class JavaApplication28 {

    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);

        System.out.println("Desea el menu vegetariano? Este contiene pimiento y tofu. O NO si quiere el no vegetariano que contiene peperoni, jamon y salmon (S/N)");
        String respuestaVegetariana = consta.nextLine();

        boolean pizzaVegetariana = respuestaVegetariana.equalsIgnoreCase("S");
        String ingredienteExtra;
        if (pizzaVegetariana) {
            System.out.println("Elija un ingrediente extra (Aceitunas, Cebolla o Champiniones):");
            ingredienteExtra = consta.nextLine();

            System.out.println("   - Ticket de Pedido -   ");
            System.out.println("- Pizza Vegetariana");
            System.out.println("- Ingredientes: Mozzarella, Tomate, Pimiento, Tofu y " + ingredienteExtra);
        } else {
            System.out.println("Elija un ingrediente extra (Aceitunas, Cebolla o Champiniones):");
            ingredienteExtra = consta.nextLine();

            System.out.println("   - Ticket de Pedido -   ");
            System.out.println("- Pizza No Vegetariana");
            System.out.println("- Ingredientes: Mozzarella, Tomate, Peperoni, Jamon, Salmon y " + ingredienteExtra);
        }

    }

}
