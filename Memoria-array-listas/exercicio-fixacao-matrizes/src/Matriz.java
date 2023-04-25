import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.

Exemplo:
Input:             Output:
3                  Main diagonal:
5 -3 10            5 8 -4
15 8 2             Negative numbers = 2
7 9 -4*/

public class Matriz {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int [][] matriz = new int [n][n]; //dois colchetes para indicar que é bisimensional
                                         //a matriz, segundo o exemplo, será bidimensional com n linhas e n colunas.
       int contador = 0;
       for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            matriz[i][j] = sc.nextInt();
            if(matriz[i][j] < 0) {
                contador++;
            }
        }
       }

       System.out.println();
       System.out.println("Diagonal principal: ");
       for(int i = 0; i < matriz.length; i++){
        System.out.print(matriz[i][i] + " ");
       }
       // ou da seguinte forma: System.out.print(matriz[0][0] + " " + matriz[1][1] + " " + matriz[2][2]);
       System.out.println();
       System.out.print("Números negativos: " + contador);
       

       sc.close();
    }
}
