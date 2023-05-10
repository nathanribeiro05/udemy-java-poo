/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo. Nota: o instante do pedido deve ser
o instante do sistema: new Date() 

Exemplo:

Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2
ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00*/

package Aplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.Enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String mail = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(nome, mail, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItems(orderItem);   
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        

        sc.close();
    }
}

