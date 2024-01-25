import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3",
                "9", "9", "6", "5");

        List<Integer> collected = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        /*
        System.out.println("Imprima todos os elementos dessa lista de string");
        numerosAleatorios.forEach(System.out::println);



        System.out.println("pegue os 5 primeiros e coloque dentro se um Set");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("Transforme essa lista de String em uma lista de Inteiros.");
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());

         System.out.println("Pegue os numeros pares e maiores que 2 e coloque numa lista.");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

         */
        System.out.println("Remova os valores impares: " );
        collected.removeIf(i -> i % 2 != 0);
        System.out.println(collected);



    }
}