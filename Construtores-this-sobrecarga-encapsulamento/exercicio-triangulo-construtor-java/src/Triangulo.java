public class Triangulo {

    private Double a;
    private Double b;
    private Double c;

    public Triangulo(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }    
    
}
