package aplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contratos;
import entities.Funcionario;
import entities.enums.LevelFuncionario;

/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo:

Enter department's name: Design

Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00

How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20

Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18

Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10

Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00*/

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String departamentoFuncionario = sc.nextLine();        
        System.out.println();
        System.out.println("Digite os dados do funcionário: ");
        System.out.print("Nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.print("Level: ");
        String levelFuncionario = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBaseFuncionario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nomeFuncionario, LevelFuncionario.valueOf(levelFuncionario), salarioBaseFuncionario, new entities.Departamento(departamentoFuncionario));

        System.out.println();
        System.out.print("Quantos contratos tem o funcionário? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do contrato # " + i + ".");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Quantidade de horas: ");
            int quantidadeHoras = sc.nextInt();
            System.out.println();
            Contratos contratos = new Contratos(quantidadeHoras, dataContrato, valorHora);
            funcionario.adicionarContrato(contratos); //associa cada contrato lido no laço ao funcionário.
        }

        System.out.println();
        System.out.print("Digite o mês e o ano para calcular o recebimento total (MM/YYYY): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3));
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Renda para " + mesAno + ": " + String.format("%.2f", funcionario.recebimento(ano, mes)));



        sc.close();
    }
}
