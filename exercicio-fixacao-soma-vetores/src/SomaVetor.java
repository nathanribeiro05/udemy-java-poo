import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor

Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0

VALORES = 8.0 4.0 10.0 14.0
SOMA = 36.00
MEDIA = 9.00*/

public class SomaVetor {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        double soma = 0.00;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.println();
        System.out.print("VALORES: ");

        for (int i = 0; i < n; i++) {
             System.out.printf("%.1f ", vetor[i]);
        }

        double media = soma/n;
        System.out.println();
        System.out.printf("SOMA: " + String.format("%.2f", soma));
        System.out.println();
        System.out.printf("MEDIA: " + String.format("%.2f", media));


        sc.close();
    }
}
