import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1026 {
    public static void main(String[] args) {
        var names = List.of("yamamoto","kis","sugiyama");
        var nums = IntStream.of(2,5,3);
        var strs = List.of("apple","banana","orange","pineapple");

        var result1 = strs.stream()
                .filter(s->s.length()>=6)
                .map(s->s.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result1);

        var result2 = (int )strs.stream()
                .filter(s -> s.length()>=6)
                .count();
        System.out.println(result2);

        var result3 = strs.stream()
                .allMatch(s -> s.contains("a"));
        System.out.println(result3);

        var result4 = strs.stream()
                .anyMatch(s -> s.contains("a"));
        System.out.println(result4);

        IntStream.rangeClosed(1,3).forEach(i -> System.out.print("test"));
        var result= names.stream().map(String::toUpperCase).toList();
        System.out.println(result);
        result= names.stream().map("%s‚³‚ñ"::formatted).toList();
        System.out.println(result);
        result= names.stream().map(s->s.toLowerCase()).toList();
        System.out.println(result);
    }
}
