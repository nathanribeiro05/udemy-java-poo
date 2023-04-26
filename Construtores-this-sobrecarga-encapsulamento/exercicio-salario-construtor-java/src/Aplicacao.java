import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário.

Exemplo: 
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: Joao Silva, $ 5000.00
Which percentage to increase salary? 10.0
Updated data: Joao Silva, $ 5600.00*/

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salário bruto: ");
        double salario = sc.nextDouble();
        System.out.print("Taxa: ");
        double tax = sc.nextDouble();
        Funcionario funcionario = new Funcionario(name, salario, tax);

        System.out.println();
        System.out.println("Funcioário: " + funcionario);
        System.out.print("Qual a porcentagem de aumento? ");
        double percentage = sc.nextDouble();
        funcionario.salarioLiquido(percentage);

        System.out.println("Dados atualizados: " + funcionario);
        
        sc.close();
    }
}
