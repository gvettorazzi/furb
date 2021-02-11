import java.util.Scanner;
public class Uni5ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double menor = 0;
        double M = 0;
        int Contpos = 0;
        System.out.println("Digite a quantidade de números: ");
        int N = teclado.nextInt();

        for(int cont = 1; cont <= N; cont++) {
            System.out.println("Digite o número: ");
            double numero = teclado.nextInt();
            if(numero < 0 && numero < menor) {
                menor = numero;
            }

            if(numero > 0) {
                M = M + numero;
                Contpos++;
            }
            System.out.println("O menor número negativo é: " + menor);
            System.out.println("A média dos número positivos é: " + M / Contpos++);
        }
        teclado.close();
    }
}
