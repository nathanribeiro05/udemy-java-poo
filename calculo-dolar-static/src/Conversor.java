public class Conversor {

    public static double cotacao;
    public static double quantidade;
    public static final double IOF = 0.06;

    public static double conversao() {
        cotacao += (cotacao * IOF);
        return cotacao * quantidade;
    }
    
}
