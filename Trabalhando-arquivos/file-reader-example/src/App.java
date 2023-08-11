import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\EstudosJava\\udemy-java-poo\\Trabalhando-arquivos\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            //enquanto o arquivo tiver linha, imprima a linha.
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
