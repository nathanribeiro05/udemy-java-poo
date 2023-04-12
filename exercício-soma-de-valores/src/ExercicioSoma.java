import java.util.Scanner;

public class ExercicioSoma {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número:");
        int x = sc.nextInt();
        System.out.println("Digite o valor do segundo número:");
        int y = sc.nextInt();

        System.out.println("SOMA = " + (x + y));


        sc.close();
    }
}
