import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.

Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20

NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4*/

public class NumerosPares {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Números pares: ");

        int contador = 0;
        for(int i = 0; i < n; i++) {
            if(vetor[i]%2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                contador++;
            }
        }

        System.out.println();
        System.out.print("Quantidade de números pares: " + contador);
        


        sc.close();
    }
}
