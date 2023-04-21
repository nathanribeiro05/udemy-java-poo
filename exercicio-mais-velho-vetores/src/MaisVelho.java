import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17

PESSOA MAIS VELHA: Carlos*/

public class MaisVelho {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();
       

        Dados[] vetor = new Dados[n];

        String name;
        int age;
        for(int i = 0; i < n; i++) {    
            sc.nextLine();      
            System.out.printf("Dados da %da pessoa:\n", i + 1);           
            System.out.print("Nome: ");
            name = sc.nextLine();           
            System.out.print("Idade: ");
            age = sc.nextInt();
            vetor[i] = new Dados(name, age);
        }

        int posicaoMaior = 0;
        int maiorIdade = 0;
        for(int i = 0; i < n; i++) {
            if(vetor[i].getIdade() > maiorIdade) {
                maiorIdade = vetor[i].getIdade();
                posicaoMaior = i;
            }
            
        }

        System.out.println();
        System.out.println("PESSOA MAIS VELHA: " + vetor[posicaoMaior].getNome());

    
        sc.close();
    }
}
