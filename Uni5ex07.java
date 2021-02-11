import java.util.Scanner;

public class Uni5ex07 {
  public static void main(String[] args) {
    System.out.println("\033[H\033[2J"); //limpa console
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qtd. valores: ");
    int n = teclado.nextInt();

    double valorLido, valorMenor = Double.MAX_VALUE, valorMaior = Double.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      System.out.println("Valores: ");
      valorLido = teclado.nextDouble();
      if (valorLido < valorMenor) {
        valorMenor = valorLido;
      }
      if (valorLido > valorMaior) {
        valorMaior = valorLido;
      }
    }

    System.out.println("valor menor: " + valorMenor);
    System.out.println("valor maior: " + valorMaior);

    teclado.close();
  }
}