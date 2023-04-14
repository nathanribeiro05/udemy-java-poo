public class Empregado {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    
    public void increaseSalary(double increaseTax) {
        grossSalary += (grossSalary * (increaseTax / 100));
    } 

    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
