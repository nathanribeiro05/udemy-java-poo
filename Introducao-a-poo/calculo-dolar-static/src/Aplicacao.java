/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.

Exemplo:
What is the dollar price? 3.10
How many dollars will be bought? 200.00
Amount to be paid in reais = 657.20*/

import java.util.Locale;
import java.util.Scanner;


public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dólar: U$");
        Conversor.cotacao = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        Conversor.quantidade = sc.nextDouble();
        System.out.printf("Quantidade a ser paga em reais: R$ %.2f", Conversor.conversao());



        sc.close();
    }
}
