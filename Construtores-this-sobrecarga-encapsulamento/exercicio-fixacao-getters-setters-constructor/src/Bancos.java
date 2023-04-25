import java.util.Locale;
import java.util.Scanner;

/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.

Exemplo:
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00
Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00
Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00
Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00*/

public class Bancos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Contas conta; // declaração feita fora da cadeia condicional (if/else).

        System.out.print("Número da conta: ");
        int numero = sc.nextInt(); 

        System.out.print("Titular da conta: ");
        sc.nextLine();

        String nome = sc.nextLine();
        System.out.print("Existe valor de depósito inicial (S/N)? ");
        char resp = sc.next().charAt(0);
        
        if (resp == 'S') {
            System.out.print("Entre o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Contas(numero, nome, depositoInicial); // caso resp seja S, a conta será instanciada com 3 argumentos.
        } else {
            conta = new Contas(numero, nome); // caso resp seja N, a conta será instanciada com 2 argumentos.
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor de depósito: ");
        double segundoDeposito = sc.nextDouble();
        conta.deposito(segundoDeposito);

        System.out.print("Dados de conta atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor de saque: ");
        double primeiroSaque = sc.nextDouble();
        conta.saque(primeiroSaque);

        System.out.print("Dados de conta atualizados: ");
        System.out.println(conta);   
        


        sc.close();
    }
}
