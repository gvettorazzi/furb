import java.util.Scanner;

public class Uni5ex09 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String alunoIdade18 = "Aluno c/ 18 anos: \n";
    int alunoQtdMaior20 = 0;
    System.out.println("Qtd alunos: ");
    int alunosQtd = teclado.nextInt();
    for (int i = 0; i < alunosQtd; i++) {
      System.out.println("Nome: ");
      String alunoNome = teclado.next();
      System.out.println("Idade: ");
      int alunoIdade = teclado.nextInt();
      if (alunoIdade == 18) {
        // alunoIdade18 += alunoNome + ", ";
        alunoIdade18 += " - " + alunoNome + "\n";
      }
      if (alunoIdade > 20) {
        alunoQtdMaior20++;
      }
    }
    System.out.println(alunoIdade18);
    System.out.println("Qtd. alunos maior que 20 anos: " + alunoQtdMaior20);
  teclado.close();
  }
}