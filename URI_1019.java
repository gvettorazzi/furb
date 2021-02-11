import java.util.Scanner;

public class URI_1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempo = teclado.nextInt(); // tempo em segundos
        int horas = tempo / 3600;
        int segundosRestoHoras = tempo % 3600;
        int minutos = segundosRestoHoras / 60;
        int segundos = segundosRestoHoras % 60;
 System.out.println(horas + ":" + minutos + ":" + segundos);
        teclado.close();
    }
}
