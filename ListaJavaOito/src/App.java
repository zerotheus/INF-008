import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
        Consumer<Integer> c = new Consumer<Integer>() {
            // caso precise fazer mais uma alteracao do que um print
            public void accept(Integer t) {
                System.out.println(t);
            }
        };
        // numbers.forEach(c);
        // numbers.stream().filter(n -> n.intValue()%2!=0).forEach(c);
        System.out.println("Q1");
        numbers.forEach(System.out::println);
        System.out.println("Q2");
        numbers.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println("Q3");
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).filter(n -> n.intValue() % 2 != 0).forEach(System.out::println);
        // ou numbers.stream().distinct().sorted(Comparator.reverseOrder()).filter(n -> n.intValue() % 2 != 0).forEach(System.out.println(n-> " " + n));
        System.out.println("Q4");
        int i = numbers.stream().skip(3).mapToInt(n->n).sum();
        //skip pula os 3 primeiros, mapToInt mapei os numeros para inteiros, .sum() soma;
        System.out.println(i);
        System.out.println("Q5");
        numbers.forEach(n->System.out.println(n*2));
        System.out.println("Q6");
        System.out.println(numbers.stream().distinct().collect(Collectors.groupingBy(n-> n % 2 ==0)).values());
        // Collectors.groupingBy(n-> n % 2 ==0) agrupa de acordo com um criterio;
        System.out.println("Q7");
        System.out.println(numbers.stream().max(Comparator.naturalOrder()).orElseThrow());
        //max recebe um compartor;
        System.out.println("Q8");
        numbers.stream().limit(3).forEach(System.out::println);
        System.out.println("Q9");
        System.out.println(numbers.stream().mapToInt(n->n).average().getAsDouble());
        System.out.println("Q10");
        System.out.println((numbers.stream().mapToInt(n->n).average().getAsDouble()));
        System.out.println(numbers.stream().mapToInt(n->n).sum());
        System.out.println(numbers.size());
        System.out.println(numbers.stream().max(Comparator.naturalOrder()));
        System.out.println("Q11");
        //data do seu dia ai
        LocalDate hoje = LocalDate.now();
        numbers.stream().distinct().forEach(n->System.out.println(hoje.plusDays(n)));
        //soma a data de hoje com o inteiro da lista numbers.
    }
}
