package multithreading;

import java.util.stream.IntStream;

public class ExemploParallelStream {
    public static void main(String[] args) {
//        IntStream.range(1,6).forEach(x -> {
//            long fat = 1L;
//            for( int i = 1; i <= x; i++){
//                fat = fat * i;
//            }
//            System.out.println(fat);
//        });


        IntStream.range(1,21).parallel().forEach(x -> System.out.printf("Fatorial de %d é: %d\n", x, fatorial(x)));
        // Parallel stream usa 1 thread a menos do o disponivel do processador
        // Parallel stream não é ordenado! Entretanto ele é muito mais rapido do que o stream normal
    }

    public static long fatorial(long num) {
        long fat = 1L;
        for (int i = 2; i <= num; i++){
            fat = fat * i;
        }
        return fat;
    }
}
