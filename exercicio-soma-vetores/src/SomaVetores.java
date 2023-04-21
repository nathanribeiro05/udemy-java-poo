import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.

Exemplo:
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A:
8
2
11
14
13
20
Digite os valores do vetor B:
5
10
3
1
10
7
VETOR RESULTANTE:
13
12
14
15
23
27*/

public class SomaVetores {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < n; i++) {            
            vetorA[i] = sc.nextInt();            
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < n; i++) {            
            vetorB[i] = sc.nextInt();            
        }

        for(int i = 0; i < n; i++) {            
            vetorC[i] = vetorA[i] + vetorB[i];                                    
        }

        System.out.println("Vetor resultante: ");
        for(int i = 0; i < n; i++) {
            System.out.printf("%d\n", vetorC[i]);
        }


        sc.close();
    }
}
