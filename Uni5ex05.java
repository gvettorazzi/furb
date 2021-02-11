import java.util.Scanner;
public class Uni5ex05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Entre com qtd: ");
		int qtd = teclado.nextInt();
		
		int numero = 8, soma = 0;
		for(int cont=2 ;cont<=qtd;cont++) {
			System.out.println(numero+","+(numero+2));
			soma = soma + numero + (numero + 2);
			numero = numero * 2;
		}
		System.out.println("soma: "+soma);
//		 118
//======================
		int num = 8, soma2 = 0;
		for(int cont=2 ;cont<=qtd;cont++) {
			System.out.println("Numero: "+num);
			soma2 = soma2 + num;
			if ((cont % 2) == 0) { // par
				num += 2;;
			} else { // impar
				num = (num-2)*2;
			}
		}
		System.out.println("soma: "+soma2);
		// 118
		
		teclado.close();	}
}