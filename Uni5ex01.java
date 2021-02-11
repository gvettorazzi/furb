import java.util.Scanner;
public class Uni5ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		for (int cont = 1; cont <= 20; cont++) {
			System.out.println("Número ["+cont+"]: ");
			numero = teclado.nextInt();
			if ((numero % 2) == 0) {
				System.out.println("É par.");
			}
			else {
				System.out.println("É impar.");
			}
		}
		System.out.println("__FIM__");
		teclado.close();
	}
}