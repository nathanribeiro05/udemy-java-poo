import java.util.Scanner;

public class ExercicioCirculo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio:");
        double x = sc.nextDouble();

        double X = Math.pow(x, 2);
        double A = 3.14159 * X;

        System.out.printf("A = %.4f%n", A);


        sc.close();

        
    }
}
