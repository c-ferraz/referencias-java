package interfaces.funcionais;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        //Um consumer vai consumir um dado e executar operações sem retornar um resultado (return type void)
        Consumer<String> printTexto = System.out::println;//Aceita method reference
        //O exemplo acima é a mesma coisa que:
        //Consumer<String> printTexto = texto -> System.out.println(texto);
        printTexto.accept("asd");
    }
}
