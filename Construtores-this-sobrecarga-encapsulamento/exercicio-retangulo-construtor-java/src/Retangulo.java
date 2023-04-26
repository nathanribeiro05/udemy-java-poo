public class Retangulo {
    
    private Double largura;
    private Double altura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double area() {
        return largura*altura;
    }

    public double perimetro() {
        return (largura+altura)*2;
    }

    public double diagonal() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }

}
