import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
    public static void main(String[] args) {
        // Entrada
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.000");
        double pi = 3.14159;
        double raio = teclado.nextDouble();

         // Processo 
         double área = pi * raio * raio;


         // Saída 
         System.out.println("A=" + df_4.format(área));

    teclado.close();
    }
} 
        




        







            
    

    


