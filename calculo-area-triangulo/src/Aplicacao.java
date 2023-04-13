import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores dos lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Digite os valores dos lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        System.out.printf("A área do triângulo X = %.4f%n" , areaX);

        double areaY = y.area();
        System.out.printf("A área do triângulo Y = %.4f%n" , areaY);

        if (areaX > areaY) {
            System.out.println("A área do triângulo X é maior.");
        } else {
            System.out.println("A área do triângulo Y é maior");
        }




        sc.close();
    }
}
