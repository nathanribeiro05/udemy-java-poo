import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).

Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0

MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3*/

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        int posMaior = 0;
        double maior = 0.00;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            if(vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor: %.1f\n", maior);        
        System.out.print("Posição do maior número: " + posMaior);

        sc.close();
    }

}
