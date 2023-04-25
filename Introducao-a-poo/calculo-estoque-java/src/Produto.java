public class Produto {

    public String name;
    public double price;
    public int quantity;

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
