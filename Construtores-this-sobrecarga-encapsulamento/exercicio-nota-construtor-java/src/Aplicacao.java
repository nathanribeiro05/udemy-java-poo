import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota).

Exemplos:
Entrada:          Saída:
Alex Green        FINAL GRADE = 90.00
27.00             PASS
31.00
32.00

Entrada:          Saída:
Alex Green        FINAL GRADE = 52.00
17.00             FAILED
20.00             MISSING 8.00 POINTS
15.00*/

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do aluno: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Nota 1: ");
        double grade1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double grade2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double grade3 = sc.nextDouble();

        Aluno aluno = new Aluno(name, grade1, grade2, grade3);

        System.out.println();
        System.out.print("Nota final: " + aluno.notaFinal());
        System.out.println();
        if(aluno.notaFinal() > 60.0) {
            System.out.println("ALUNO APROVADO.");
        } else {
            System.out.println("ALUNO REPROVADO.");
            System.out.println("FALTANDO " + (60.00 - aluno.notaFinal()) + " PONTOS.");
        }


        sc.close();
    }
}
