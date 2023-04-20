import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7

NUMEROS NEGATIVOS:
-2
-3
-7*/

public class Negativos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Quantos número você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Números negativos: ");

        for(int i = 0; i < n; i++) {
            if(vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]); // "%d\n" organiza os elementos com uma quebra de linha
            }
        }


        sc.close();
    }
}
