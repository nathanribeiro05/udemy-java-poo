import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires*/

public class Aprovados {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();

        Dados[] vetor = new Dados[n];

        String name;
        double gradeOne;
        double gradeTwo;
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira nota e segunda nota do %do aluno: \n", i + 1);
            name = sc.nextLine();
            gradeOne = sc.nextDouble();
            gradeTwo = sc.nextDouble();
            vetor[i] = new Dados(name, gradeOne, gradeTwo);
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < n; i++) {
            if(vetor[i].media() >= 6) {
                System.out.printf("%s\n", vetor[i].getNome());
            }
        }

        sc.close();
    }
}
