public class Aluno {

    public String nome;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public double notaFinal() {
        return notaUm + notaDois + notaTres;
    }

    public double pontosFaltantes() {
        return 60.0 - notaFinal();
    }
}
