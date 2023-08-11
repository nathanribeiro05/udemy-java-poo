import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "C:\\EstudosJava\\udemy-java-poo\\Trabalhando-arquivos\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            //instanciação da string básica
            fr = new FileReader(path);
            //instancia a string de buffer a partir de filereader, para aumentar velocidade de leitura
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            //bloco try-catch para tratar qualquer exceção que ocorrer no fechamento de br ou fr
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
