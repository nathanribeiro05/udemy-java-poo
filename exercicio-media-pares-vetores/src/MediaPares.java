import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0

Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
*/

public class MediaPares {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        int contador = 0;
        double soma = 0.00;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if(vetor[i]%2 == 0) {
                soma += vetor[i];
                contador++;
            }         
        }

        if(contador != 0) {
        System.out.println();
        System.out.printf("Média dos pares: %.1f", (soma/contador));
        } else if(contador == 0) {  
            System.out.println("NENHUM NÚMERO PAR.");          
        }       
        
        sc.close();
    }
}
