import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo:

Insira o valor de linhas da matriz:
3
Insira o valor de colunas da matriz:
4

Matriz:
10 8 15 12
21 11 23 8
14 5 13 19

Insira o valor de X:
8

Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19*/

public class Matriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número de linhas da matriz:");
        int m = sc.nextInt();
        System.out.println("Insira o número de colunas da matriz:");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz:");
        for(int i = 0; i < m; i++) {   //método para impressão de matriz
            for(int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Insira o valor de X:");
        int x = sc.nextInt();
        

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                if(matriz[i][j] == x) {
                    System.out.println();
                    System.out.println("Posição " + i + ", " + j + ":");
                    if(j > 0) {
                        System.out.println("Elemento à esquerda: " + matriz[i][j-1]);
                    }
                    if(i > 0) {
                        System.out.println("Elemento acima: " + matriz[i-1][j]);
                    }
                    if(j < n-1) {
                        System.out.println("Elemento à direita: " + matriz[i][j+1]);
                    }
                    if(i < m-1) {
                        System.out.println("Elemento abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        
        sc.close();
    }
}
