package interfaces.funcionais;

import java.util.Locale;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        final String VALOR = "TEXTO";
        //A interface Function, recebe uma valor e retorna um valor
        //A sua extrutura é: Function<TipoDeEntrada, TipoDeSaida> nomeDaVariavel = expressão lambda/method reference
        Function<String, String> fazerLowerCase = texto -> texto.toLowerCase();
        System.out.println(fazerLowerCase.apply(VALOR));

        //Se você não indicar os tipos ele aceita que o tipo do retorno é igual ao da entrada
        Function concatenarValor = texto -> texto + " - ";
        System.out.println(concatenarValor.apply(VALOR));

        //Exemplo entrada e saida diferentes com method reference
        Function<String, Integer> converterStringParaInt = Integer::valueOf;
        System.out.printf("O valor indicado é um Integer? %s\n", converterStringParaInt.apply("10") instanceof Integer);

        //Caso você tenha mais de uma instrução na função é necessario indicar o retorno na instrução
        Function<String, String> concatenaELowerCaseString = valor -> {
                String concatenado = "*" + valor + "*";
                return concatenado.toLowerCase();

        };
        System.out.println(concatenaELowerCaseString.apply(VALOR));


    }
}
