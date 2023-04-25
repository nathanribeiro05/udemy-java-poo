import java.util.Locale;
import java.util.Scanner;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo:

How many rooms will be rented? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5
Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1
Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy rooms:
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com*/

public class AluguelQuartos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Dados[] vetor = new Dados[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();      


        String name;
        String mail;
        int room;
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:", i + 1);
            System.out.println();
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            mail = sc.nextLine();
            System.out.print("Quarto: ");
            room = sc.nextInt();
            vetor[room] = new Dados(name, mail);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for(int i = 0; i < 10; i++) {
            if(vetor[i] != null) {
            System.out.println(i + ": " + vetor[i].getNome() + ", " + vetor[i].getEmail());
            }
        }

        sc.close();
    }
}
