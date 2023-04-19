public class Produto {

    private String name; //por convenção, os atributos de uma classe só podem ser acessados por ela
    private double price;//, por isso utilizamos o private para declarar atributos.
    private int quantity;

    public Produto() { //Construtor padrão.

    }

    public Produto(String name, double price, int quantity) { //Construtor criado para predefinir todos os atributos do produto.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto(String name, double price) { //Construtor realizando sobrecarga, definindo apenas nome e preço.
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }    
    
    public double totalValueInStock() {
        return quantity * price;
         
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; //this. especifica que está se referindo ao 
                                   //atributo quantity da classe (public int quantity) e não ao parâmetro do método. 
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name 
        + ", $" 
        + String.format("%.2f", price) 
        + ", " 
        + quantity 
        + " units, Total: $" 
        +  String.format("%.2f", totalValueInStock());
    }
    
}