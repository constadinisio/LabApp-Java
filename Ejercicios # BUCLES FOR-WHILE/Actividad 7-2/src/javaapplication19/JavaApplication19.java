package javaapplication19;
import java.text.DecimalFormat;
import java.util.*;

public class JavaApplication19 {
    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        double conversionMi = 0;
        double valorKm = 1.6093;
        double conversionKm;
        
            System.out.println("Introduzca un valor en millas para hacer el pasaje en kilometros.");
            conversionMi = consta.nextDouble();
            
            for (int i = 1; i < valorKm; i++) {
            conversionKm = valorKm * conversionMi;
            DecimalFormat df = new DecimalFormat("#.##");
            String valorFormateado = df.format(conversionKm);
            System.out.println("#-----------------#-------------#\n| Valor en Mi     | Valor en Km |\n#-----------------#-------------#\n| " + conversionMi + "            | " + valorFormateado + "      |\n#-----------------#-------------#\n\n");
            }
    }
    
}