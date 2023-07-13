/*Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta.

Exemplos:
Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00
Enter amount for withdraw: 100.00
New balance: 400.00

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00
Enter amount for withdraw: 400.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00
Enter amount for withdraw: 800.00
Withdraw error: The amount exceeds withdraw limit

Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 200.00
Withdraw limit: 300.00
Enter amount for withdraw: 250.00
Withdraw error: Not enough balance*/

package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String titular = sc.nextLine();
        sc.nextLine();
        System.out.print("Initial balance: ");
        double initBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withLimit = sc.nextDouble();

        Account conta = new Account(number, titular, initBalance, withLimit);

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        conta.withdraw(amount);
        System.out.println(conta);
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
    
}
