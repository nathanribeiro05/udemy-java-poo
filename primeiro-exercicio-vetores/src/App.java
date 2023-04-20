/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.

Exemplo:
Input:                      Output:
3                           AVERAGE HEIGHT = 1.69
1.72
1.56
1.80*/

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n]; //forma de declaração de um vetor:
                                        //(tipo -> colchetes -> nome -> new -> tipo+colchetes+tamanho(nesse caso o n)).
        
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble(); //vetor na posição i recebe o valor de cada altura.
        }

        double soma = 0.00;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        double media = soma/n;
        System.out.printf("AVERAGE HEIGHT: " + String.format("%.2f", media));


        sc.close();
    }
}
