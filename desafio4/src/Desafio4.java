import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio4{
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros2 =  new ArrayList<>(numeros);

       numeros2.removeIf(n -> n % 2 != 0);
        numeros2.forEach(System.out::println);
    }
}
