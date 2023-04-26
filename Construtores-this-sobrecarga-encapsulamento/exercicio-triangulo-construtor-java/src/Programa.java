import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.

Exemplo:
Enter the measures of triangle X:
3.00
4.00
5.00
Enter the measures of triangle Y:
7.50
4.50
4.02
Triangle X area: 6.0000
Triangle Y area: 7.5638
Larger area: Y*/

public class Programa {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os lados do triângulo X: ");
        System.out.print("Lado a: ");
        double ladoA1 = sc.nextDouble();
        System.out.print("Lado b: ");
        double ladoA2 = sc.nextDouble();
        System.out.print("Lado c: ");
        double ladoA3 = sc.nextDouble();
        System.out.println();
        System.out.println("Insira os lados do triângulo Y: ");
        System.out.print("Lado a: ");
        double ladoB1 = sc.nextDouble();
        System.out.print("Lado b: ");
        double ladoB2 = sc.nextDouble();
        System.out.print("Lado c: ");
        double ladoB3 = sc.nextDouble();
        Triangulo trianguloX = new Triangulo(ladoA1, ladoA2, ladoA3);
        Triangulo trianguloY = new Triangulo(ladoB1, ladoB2, ladoB3);

        System.out.println("Área do triângulo X: " + String.format("%.2f", trianguloX.area()));
        System.out.println("Área do triângulo Y: " + String.format("%.2f", trianguloY.area()));
        if(trianguloX.area() > trianguloY.area()) {
            System.out.println("Triângulo X tem maior área.");
        } else {
            System.out.println("Triângulo Y tem maior área.");
        }

        sc.close();
    }
}
