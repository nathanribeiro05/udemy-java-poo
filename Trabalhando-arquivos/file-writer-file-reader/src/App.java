import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\EstudosJava\\udemy-java-poo\\Trabalhando-arquivos\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { //acrescentando true após o path, faz com que o programa adicione texto no final do arquivo já criado
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); //por padrão, coloca-se a quebra de linha atrvés desse comando
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
