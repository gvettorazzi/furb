import java.util.Scanner;
public class URI_1001 {
  public static void main(String[] args) {
    // Leitura
    Scanner teclado = new Scanner(System.in);
    int A = teclado.nextInt();
    int B = teclado.nextInt();
    int X = A + B;
    System.out.println("X = "+X);
    teclado.close();
  }
}