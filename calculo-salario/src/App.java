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

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado empregado = new Empregado();
        System.out.print("Nome: ");
        empregado.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        empregado.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        empregado.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + empregado);
        System.out.println();
        System.out.print("Qual porcentagem será acrescida ao salário? ");
        double increaseTax = sc.nextDouble();
        empregado.increaseSalary(increaseTax);

        System.out.println();
        System.out.println("Dados atualizados: " + empregado);


        sc.close();
    }
}
