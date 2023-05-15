package Aplication;

import java.nio.channels.AcceptPendingException;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc; //atribuição de uma subclasse à super classe (no caso estou atribuindo bacc(BusinessAcc0ount - subclasse) à acc1(Account - superclasse)).
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2; //colocar a subclasse manualmente para fazer o downcasting. acc2 é tipo Account.
        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc6 = new Account(1006, "Peter", 1000.0);
        acc6.withdraw(200.0); 
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1007, "Carlos", 1000.0, 0.01);
        acc7.withdraw(200.0); //teste com método sobrescrito em SavingsAccount.
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1008, "Jessica", 1000.0, 500.0);
        acc8.withdraw(200.0); //teste com método sobrescrito em BusinessAccount.
        System.out.println(acc8.getBalance());

        Account x = new Account(1020, "Pedro", 1000.0);
        Account y = new SavingsAccount(1023, "Jana", 1000.0, 0.01);

        x.withdraw(50.0); //x e y exemplos de polimorfismo.
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }   
}

