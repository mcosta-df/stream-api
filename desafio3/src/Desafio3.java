import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        boolean temNagativo = numeros.stream().anyMatch(n -> n < 0);

        System.out.println("Existe numero negativo:" + temNagativo);

    }
}
