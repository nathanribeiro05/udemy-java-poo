import java.util.Scanner;

public class ExercicioScan {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        System.out.println("Você digitou a palavra: " + x);

        int y = sc.nextInt();
        System.out.println("Você digitou o número: " + y);

        double z = sc.nextDouble();
        System.out.println("Você digitou o número: " + z);

        char w = sc.next().charAt(0);
        System.out.println("Você solicitou o carectere: " + w);



        sc.close();
    }
}
