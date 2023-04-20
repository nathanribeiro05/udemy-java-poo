import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.

Exemplo:
Input:                    Output:
3                         AVERAGE PRICE = 700.00
TV
900.00
Fryer
400.00
Stove
800.00*/

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produtos[] vetor = new Produtos[n]; //como o vetor é do tipo da classe, ele terá a tipagem com o nome da classe.
                                            //(nesse caso Produtos, ou seja, é um vetor do tipo Produtos).
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Produtos(name, price); //o vetor recebe os aributos da classe produto com os parâmetros
        }                                         //name e price previamente declarados.

        double soma = 0.00;
        for(int i = 0; i < n; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma/n;
        System.out.printf("AVERAGE PRICE: $" + String.format("%.2f", media));

        sc.close();
    }
}
