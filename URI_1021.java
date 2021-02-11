import java.util.Scanner;

public class URI_1021
{

    public static void main(String[] args)
    {
        float x;
        int nota100,nota50,nota20,nota10,nota5,nota2;
        int moeda1,moeda5,moeda25,moeda10,moeda05,moeda01;
        int valor100;
        Scanner input=new Scanner(System.in);
        x = input.nextFloat();
        nota100 =(int) x / 100;
        valor100 = (int) (x % 100);
        nota50 = (valor100) / 50;
        nota20 = (valor100 % 50 )/ 20;
        nota10 = ((valor100 % 50 )% 20) / 10;
        nota5 = (((valor100 % 50 )% 20) % 10) / 5;
        nota2 = (((valor100 % 50 )% 20) % 5) / 2;

        //------     MOEDAS:    ------------//
        moeda1 =  (((((valor100 % 50 )% 20) % 5) % 2) / 1);
        float ValorMoeda = (float) (((((valor100 % 50 )% 20) % 5) % 2));

        float moeda5Float = (float) ((ValorMoeda % 1) / .5);
        moeda5 = (int) (moeda5Float);

        moeda25 = (int) (((((((valor100 % 50 )% 20) % 5) % 2) % 1) % .5) / .25);
        moeda10 = (int) ((((((((valor100 % 50 )% 20) % 5) % 2) % 1) % .5) % .25) / .1);
        moeda05 = (int) (((((((((valor100 % 50 )% 20) % 5) % 2) % 1) % .5) % .25) % .1) / .05);
        moeda01 = (int) ((((((((((valor100 % 50 )% 20) % 5) % 2) % 1) % .5) % .25) % .1) % .05) / .01);


        System.out.print("NOTAS:\n");
        System.out.print(nota100 +" nota(s) de R$ 100.00\n");
        System.out.print(nota50 +" nota(s) de R$ 50.00\n");
        System.out.print(nota20 +" nota(s) de R$ 20.00\n");
        System.out.print(nota10 +" nota(s) de R$ 10.00\n");
        System.out.print(nota5 +" nota(s) de R$ 5.00\n");
        System.out.print(nota2 +" nota(s) de R$ 2.00\n\n");

        System.out.print("MOEDAS:\n");
        System.out.print(moeda1 +" moeda(s) de R$ 1.00\n");
        System.out.print(moeda5Float +" moeda(s) de R$ 0.50\n");
        System.out.print(moeda25 +" moeda(s) de R$ 0.25\n");
        System.out.print(moeda10 +" moeda(s) de R$ 0.10\n");
        System.out.print(moeda05 +" moeda(s) de R$ 0.05\n");
        System.out.print(moeda01 +" moeda(s) de R$ 0.01\n");

    }

}