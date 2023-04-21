import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

Exemplo:
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78

Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa*/

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        

        Dados[] vetor = new Dados[n];

        String name;
        int age;
        double height;
        for(int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            name = sc.nextLine();      
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            vetor[i] = new Dados(name, age, height);            
        }

        double porcentoMenores = 0.00;
        int menorIdade = 0; 
        double somaAltura = 0.00;
        for(int i = 0; i < n; i++) {
            if(vetor[i].getIdade() < 16) {
                menorIdade++;
            }
            somaAltura += vetor[i].getAltura();
        }

        porcentoMenores = ((double)menorIdade/n) * 100;
        double mediaAltura = somaAltura / n;
        
        System.out.println();
        System.out.printf("\nAltura média: %.2f\n", mediaAltura);
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", porcentoMenores);
       
        for(int i = 0; i < n; i++) {
            if(vetor[i].getIdade() < 16) {
                System.out.printf("%s\n", vetor[i].getNome());
            }
        }

        sc.close();
            
        }
        
    }

