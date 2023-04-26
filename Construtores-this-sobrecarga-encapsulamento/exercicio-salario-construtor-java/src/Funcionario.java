public class Funcionario {

    private String nome;
    private Double salarioBruto;
    private Double taxa;
    
    public Funcionario(String nome, Double salarioBruto, Double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double salarioReajustado() {
        return salarioBruto-taxa;
    }
    
    public void salarioLiquido(double porcentagem) {
        salarioBruto += (salarioBruto * (porcentagem/100));
    }

    @Override
    public String toString() {
        return nome + ", " + "R$" + String.format("%.2f", salarioReajustado());
    }    

}
