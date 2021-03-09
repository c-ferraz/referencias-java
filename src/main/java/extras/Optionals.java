package extras;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Optionals {
    public static void main(String[] args) {
        //ExemploOptionalGenerico();
        //ExemploOptionalPrimitivo();
        //ExemploOptional();
        AtividadeOptional();

    }

    private static void ExemploOptionalGenerico(){

        System.out.println("Valor opcional que está presente");
        Optional<String> optionalString = Optional.of("Valor Presente");
        //ifpresentOrElse recebe 2 argumentos
        //O primeiro é uma expressão lambda executada caso o valor esteja presente
        //O segundo é paramentro é uma implementação da interface Runnable executado caso o valor não esteja presente
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        System.out.println("Valor opcional que não está presente");
        //A diferença entre Optional.of() e Optional.ofNullable() é que o ofNullable() aceita valores nulos
        //Enquanto o Optional.of() solta uma NullPointerException se o valor for nulo
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        System.out.println("Valor opcional que não está presente");
        //O Optional.empty() tem uma funcionalidade semelhante ao Optional.ofNullable()
        //Uma vez que o Optional.ofNullable() chama o Optional.empty() caso o valor seja nulo
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        System.out.println("Valor opcional que lança erro NullPointerException");
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }

    private static void ExemploOptionalPrimitivo() {

        System.out.println("*** Valor inteiro opcional ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("*** Valor decimal opcional ***");
        OptionalDouble.of(55.0d).ifPresent(System.out::println);

        System.out.println("*** Valor longo opcional ***");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }

    private static void ExemploOptional() {

        Optional<String> optionalString = Optional.of("Valor opcional");

        //Caso seja passado um valor nulo gera um NullPointerException
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);//Esse metodo recebe um consumer (aka expressão lambda) como parametro

        if (optionalString.isPresent()) {
            String valor = optionalString.get();//Caso seja nulo solta um erro NoSuchElementException

            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat(("****"))).ifPresent(System.out::println);

        optionalString.orElseThrow(IllegalStateException::new);// Solta uma exceção APENAS se não tiver uma valor
    }

    private static void AtividadeOptional() {
        //Crie um optional de um determinado tipo de dado
        //Crie com estado vazio, estado presente e com null
        Optional<String> meuOptional = Optional.of("Valor do optional");

        System.out.println("Se presente exiba o valor no console");
        meuOptional.ifPresent(System.out::println);

        System.out.println("Se vazio lançe uma exceção IllegalStateException");
        meuOptional = Optional.ofNullable(null);
        //meuOptional.orElseThrow(IllegalStateException::new);

        System.out.println("Se vazio, exiba \"Opcional Vazio\" no console");
        meuOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

        System.out.println("Se presente, transforme o valor e exiba no console");
        meuOptional = Optional.of("Valor do optional");
        System.out.println(meuOptional.map(s -> "Novo valor do optional").orElse("Nenhum Valor Encontrado"));

        System.out.println("Se presente, pegue o valor do optional e atribua em uma variável");
        String valor = meuOptional.isPresent() ? meuOptional.get() : "NULL";
        System.out.println(valor);

        System.out.println("Se presente, filter o optional com uma determinada regra de négocio");
        Optional<String[]> optional = Optional.of(new String[]{"João", "Pedro", "Maria",  "Carla", "José", "Carlos"});
        if (optional.isPresent()) {
            Arrays.stream(optional.get())
                    .filter(nome -> nome.toLowerCase().charAt(0) == 'p')
                    .forEach(System.out::println);
        } else {
            System.out.println("Nenhum valor encontrado");
        }


    }
}
