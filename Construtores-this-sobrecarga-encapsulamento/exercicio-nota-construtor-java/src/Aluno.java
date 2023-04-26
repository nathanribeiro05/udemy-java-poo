public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;

    public Aluno(String nome, Double nota1, Double nota2, Double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1+nota2+nota3;
    }
    
    
}
