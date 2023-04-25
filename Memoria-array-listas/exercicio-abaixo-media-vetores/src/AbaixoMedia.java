import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8

MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8*/

public class AbaixoMedia {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        double media = 0.00;
        double soma = 0.00;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.println();
        media = soma/n;
        System.out.printf("Média do vetor: " + String.format("%.3f", media));

        System.out.println();
        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i < n; i++) {
            if(vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
