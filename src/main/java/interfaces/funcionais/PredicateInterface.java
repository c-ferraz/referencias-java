package interfaces.funcionais;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        // Predicates recebem um valor e realizam operações tendo um retorno booleano
        // Estrutura Predicate<TipoDeEntrada> = nomeDaVariavel = expressão lambda/method reference
        // Exemplo com expressão lambda
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test("Valor"));

        //Exemplo com method reference
        Predicate<String> stringVazia = String::isEmpty;
        System.out.println(stringVazia.test(""));

    }
}
