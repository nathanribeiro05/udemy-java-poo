import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Não é exercício, apenas comandos explicados para list. */

public class App {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>(); //declarando uma lista: List<tipo em wrapper class> nome da lista = new ArrayList<>();
                            //lista não aceita tipos primitivos como atributo, apenas wrapper classes.
                            //ArrayList é uma classe que implementa a interface List
                            //classe ArrayList foi escolhida pois ela é otimizada

        list.add("maria"); //.add adiciona elementos na sua lista
        list.add("joao");
        list.add("marta");
        list.add("marcelo");
        list.add(2, "jean"); //adiciona um elemento na posição definida. nesse caso, adicionou jean
                                           //na posição 2, empurrando o elemento da antiga posição dois para a proxima
                                           //posição da lista

        System.out.println(list.size()); //imprime no terminal o número de elementos da lista

        list.remove(0); //remove o elemento 0 da lista
        list.removeIf(x -> x.charAt(0) == 'M'); //remove os elementos que tem M na posição 0

        System.out.println("Index de joao: " + list.indexOf("joao"));//vai imprimir a posição que joao ocupa na lista
        System.out.println("Index de cleibson: " + list.indexOf("cleibson"));//vai retornar -1 pois não tem o elemento cleibson na lista
        
        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());//filtro para avaliar os elementos e, nesse caso, deixar 
                                                                                                                  // a lista apenas com elementos com a letra A na posição 0

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);//vai pegar o primeiro elemento da lista que atende o predicado declarado.
                                                                                                        //caso não ache, retornará null
                                                                                                                  
        for(String obj: list) { //for-each: o que esta no parentese significa:
            System.out.println(obj); //para cada elemento obj do tipo String na minha lista list.            
        }

    }
}
