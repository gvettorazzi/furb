import java.util.Scanner;

public class Uni6ex06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre qtd.: ");
    final int vetorQtd = teclado.nextInt();
    double vetor[] = new double[vetorQtd];

    // Adicionar
    for (int i = 0; i < vetor.length; i++) { // for (int i = 0; i < qtdVetor; i++) {
      System.out.println("Adicionar vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }

    // Pesquisar
    System.out.println("Pesquisar valor: ");
    double vetorPesquisar = teclado.nextDouble();
    for (int i = 0; i < vetor.length; i++) {
      if (vetorPesquisar == vetor[i]) {
        System.out.println("Já cadastrado, vetor[" + i + "]: " + vetor[i]);
      }
    }

    teclado.close();
  }
}
