public class Empregado {

    private Integer identidade;
    private String nome;
    private Double salario;

    public Empregado() {        
    }    

    public Empregado(Integer identidade, String nome, Double salario) {
        this.identidade = identidade;
        this.nome = nome;
        this.salario = salario;
    }  

    public Integer getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Integer identidade) {
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoSalario(double taxaAumento) {
        salario += (salario*(taxaAumento/100.0));
    }

    public String toString() {
		return identidade + ", " + nome + ", " + String.format("%.2f", salario);
	}
    
}
