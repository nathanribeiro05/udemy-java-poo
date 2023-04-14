/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota).

Exemplo:
Entrada:                     Saída:
Alex Green                   FINAL GRADE = 90.00
27.00                        PASS
31.00
32.00

Entrada:                     Saída:
Alex Green                   FINAL GRADE = 52.00
17.00                        FAILED
20.00                        MISSING 8.00 POINTS
15.00*/
  

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("ALUNO: ");
        aluno.nome = sc.nextLine();
        System.out.print("NOTA UM: ");
        aluno.notaUm = sc.nextDouble();
        System.out.print("NOTA DOIS: ");
        aluno.notaDois = sc.nextDouble();
        System.out.print("NOTA TRÊS: ");
        aluno.notaTres = sc.nextDouble();

        System.out.println("Nota final = " + String.format("%.2f", aluno.notaFinal()));

        if (aluno.notaFinal() < 60.0) {
            System.out.println("NÃO PASSOU.");
            System.out.println("PONTOS FALTANTES: " + String.format("%.2f", aluno.pontosFaltantes()));
        } else {
            System.out.println("PASSOU!");
        }

        sc.close();
    }
}
