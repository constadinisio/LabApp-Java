package javaapplication12;
import java.text.DecimalFormat;
import java.util.*;

public class JavaApplication12 {
    public static void main(String[] args) {
        Scanner consta = new Scanner(System.in);
        double conversionMi = 0;
        double valorKm = 1.6093;
        double conversionKm;
        boolean valido = true;
        
        do {
            System.out.println("Introduzca un valor en millas para hacer el pasaje en kilometros.");
            conversionMi = consta.nextDouble();
            conversionKm = valorKm * conversionMi;
            DecimalFormat df = new DecimalFormat("#.##");
            String valorFormateado = df.format(conversionKm);

            System.out.println("#-----------------#-------------#\n| Valor en Mi     | Valor en Km |\n#-----------------#-------------#\n| " + conversionMi + "            | " + valorFormateado + "      |\n#-----------------#-------------#\n\n");
            
            if ( conversionMi == 0) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n#-----------------#-------------#\n| Valor en Mi     | Valor en Km |\n#-----------------#-------------#\n| 0.0             | 0           |\n#-----------------#-------------#");
                
                valido = false;
            }
            
        } while (valido);
    }
    
}
