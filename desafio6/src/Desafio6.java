import java.util.Arrays;
import java.util.List;

public class Desafio6{
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long cont = numeros.stream().filter(n -> n > 10).count();
        System.out.println("exitem; " + cont + " numeros maiores que 10");
    }
}
