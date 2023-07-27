import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        System.out.print("Quantos elementos terão a lista? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Digite o " + (i+1) + " número: ");
            int number = sc.nextInt();
            arr.add(number);
        }
        Collections.sort(arr);

        List<Integer> finalList = arr.subList(((n/2)+1), n);

        System.out.println(finalList);

        sc.close();
    }
    
}



