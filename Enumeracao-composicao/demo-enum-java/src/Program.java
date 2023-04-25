import java.util.Date;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.ENTREGUE; //conversão de String para enum
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    
    }
}
