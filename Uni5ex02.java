public class Uni5ex02 {
	public static void main(String[] args) {
		int somaPar = 0;
		int somaImpar = 0;
		
		for (int cont = 2; cont <= 100; cont += 2) {
			somaPar = somaPar + cont;
		}
		
		for (int cont = 1; cont <= 100; cont += 2) {
			somaImpar += cont;
		}
		
		System.out.println("Soma dos números par: "+somaPar);
		System.out.println("Soma dos números ímpar: "+somaImpar);
//************
		somaPar = 0;
		somaImpar = 0;

		for (int cont=1;cont<=100;cont++) {
			if ((cont %2) == 0) { // pares
//				System.out.println("par: "+cont);
				somaPar = somaPar + cont;
			} else { // ímpares
//				System.out.println("ímpar: "+cont);
				somaImpar = somaImpar + cont;
			}
		}
		System.out.println("Soma par: "+somaPar); 	// 30
		System.out.println("Soma ímpar: "+somaImpar); // 25		
	}
}