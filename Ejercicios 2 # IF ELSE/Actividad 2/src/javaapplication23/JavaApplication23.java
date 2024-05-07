package javaapplication23;

import java.util.*;

public class JavaApplication23 {

    public static void main(String[] args) {
        String contraseña = "et20polomataderos";
        Scanner consta = new Scanner(System.in);
        System.out.println("Introduzca una contraseña");
        String contraseñaIng = consta.nextLine();

        if (contraseña.equalsIgnoreCase(contraseñaIng)) {
            System.out.println("La contraseña coincide.");
        } else {
            System.out.println("La contraseña no coincide");
        }
    }
}
