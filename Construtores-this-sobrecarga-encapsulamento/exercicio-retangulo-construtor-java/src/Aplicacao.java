import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

Exemplo:
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00*/

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os valores da largura e altura do retângulo: ");
        System.out.print("Largura: ");
        double width = sc.nextDouble();
        System.out.print("Altura: ");
        double height = sc.nextDouble();

        Retangulo retangulo = new Retangulo(width, height);

        System.out.println();
        System.out.println("Área do retângulo: " + String.format("%.2f", retangulo.area()));
        System.out.println("Perímetro do retângulo: " + String.format("%.2f", retangulo.perimetro()));
        System.out.println("Diagonal do retângulo: " + String.format("%.2f", retangulo.diagonal()));

        sc.close();
    }
}
