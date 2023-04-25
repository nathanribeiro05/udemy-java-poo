/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

Exemplo:
Entrada:                Saída:
2.00                    A=12.5664*/

import java.util.Scanner;

public class ExercicioCirculo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio:");
        double x = sc.nextDouble();

        double X = Math.pow(x, 2);
        double A = 3.14159 * X;

        System.out.printf("A = %.4f%n", A);


        sc.close();

        
    }
}
