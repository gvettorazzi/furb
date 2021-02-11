import java.util.Scanner;

public class Uni6ex01 {
    static Scanner teclado = new Scanner(System.in);

    public static void vetorLer(int vetor[]) {
        for (int j = 0; j < vetor.length; j++) {
            System.out.println("Entre vetor[" + j + "]: ");
            vetor[j] = teclado.nextInt();
        }
    }

    public static void vetorEscrever(int vetor[]) {
        for (int j = vetor.length - 1; j >= 0; j--) {
            System.out.println("vetor[" + j + "]: " + vetor[j]);
        }
    }

    public static void main(String[] args) {
        int vetor[] = new int[10];

        vetorLer(vetor);

        vetorEscrever(vetor);

        teclado.close();
    }
}