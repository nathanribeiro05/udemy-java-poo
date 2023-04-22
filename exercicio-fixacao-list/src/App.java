import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.

Exemplo 1:
How many employees will be registered? 3
Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Emplyoee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase : 536
Enter the percentage: 10.0

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

Exemplo 2:
How many employees will be registered? 2
Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Enter the employee id that will have salary increase: 776
This id does not exist!

List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3000.00*/

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();
        
        System.out.print("Quantos empregados serão registrados? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Empregado #" + (i + 1) + ":");
            System.out.print("Identidade: ");
            Integer identidade = sc.nextInt();

            while(hasId(list, identidade)){
                System.out.print("Essa identidade já está cadastrada. Tente novamente: ");
                identidade = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Empregado emp = new Empregado(identidade, nome, salario);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Entre com a id do funcionário que terá aumento: ");
        int funcionarioBonificado = sc.nextInt();
        Empregado emp = list.stream().filter(x -> x.getIdentidade() == funcionarioBonificado).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("Essa id não existe.");
        } else {
            System.out.print("Entre a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            emp.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de empregados:");
        for(Empregado obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Empregado> list, int id) {
        Empregado emp = list.stream().filter(x -> x.getIdentidade() == id).findFirst().orElse(null);
        return emp != null;
    }

}
