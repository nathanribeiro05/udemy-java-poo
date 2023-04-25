import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Price: ");
        double preco = sc.nextDouble();
        
        Produto produto = new Produto(nome, preco); //Variável produto já é criada com definição.

        System.out.println();
        System.out.println("Product data: " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);

        sc.close();
    }
}