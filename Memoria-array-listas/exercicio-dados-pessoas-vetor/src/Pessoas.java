import java.util.Locale;
import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.

Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F

Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2*/

public class Pessoas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int n;
        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        Dados[] vetor = new Dados[n];

        double height;
        char gender;
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            height = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa: ", i + 1);
            gender = sc.next().charAt(0);
            vetor[i] = new Dados(height, gender);
        }

        double menorAltura = vetor[0].getAltura();
        for(int i = 0; i < n; i++) {            
            if(vetor[i].getAltura() < menorAltura) {
                menorAltura = vetor[i].getAltura();
            }
        }

        double maiorAltura = vetor[0].getAltura();
        for(int i = 0; i < n; i++) {            
            if(vetor[i].getAltura() > maiorAltura) {
                maiorAltura = vetor[i].getAltura();
            }
        }

        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;
        double alturaFeminina = 0.00;
        for(int i = 0; i < n; i++) {
            if(vetor[i].getGenero() == 'M') {
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
                alturaFeminina += vetor[i].getAltura();
            }
        }

        double mediaAlturaFeminina = alturaFeminina/quantidadeMulheres;

        System.out.println();
        System.out.printf("Menor altura: %.2f", menorAltura);
        System.out.println();
        System.out.printf("Maior altura: %.2f", maiorAltura);
        System.out.println();
        System.out.printf("Média da altura entre as mulheres: %.2f", mediaAlturaFeminina);
        System.out.println();
        System.out.println("Número de homens: " + quantidadeHomens);


        sc.close();
    }
}
