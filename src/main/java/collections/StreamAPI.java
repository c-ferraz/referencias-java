package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        //ExemploStreamAPI();
        AtividadeStreamAPI();
        //DobraOsNumeros(5,6,8,10,22);

    }

    private static void ExemploStreamAPI(){
        List<String> estudantes = new ArrayList<>();

        //Lista com 7 estudantes
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com o maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));//Method Reference

        //Retorna o elemento com o menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna o elemento que tem a letra R no nome
        //filter() SEMRE recebe uma expressão lambda que DEVE ser um regra retornando true or false
        //Ele cria uma nova stream e adiciona os elementos que são TRUE para a regra informada, os elementos FALSE são descartados
        //Collect é uma parte da stream API que serve para coletar o stream em diversos formatos (ex: set, list)
        System.out.println("Com letra r no nome: " + estudantes.stream().filter( (estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        //Map é similar ao filter mas ele retorna uma coleção com o mesmo tamanho do original
        //Pode conter elementos de tipos diferentes MAS deve conter a mesma quantidade de elementos
        System.out.println("Retorna uma coleção com a quantidade de letras " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console, e depois retorna a mesma coleção
        //Executa a expressão dentro do peek() para cada elemento e depois retorna a mesma coleção
        System.out.println("Retorna os elementos " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção
        //Parece o metodo peek() (executa expressão para cada elemento) mas ele não retorna nada no final
        System.out.print("Retorna os elementos novamnete: ");
        estudantes.stream().forEach(System.out::println);

        //Retorna true se todos os elementos possuem a letra W no nome
        //recebe uma expressão lambda e faz uma verificação boleana em todos os elementos
        //retorna true se TODOS os elementos da coleção forem true para a expressão apresentada
        System.out.println("Todos os elementos tem o W no nome? " + estudantes.stream().allMatch( (elemento) -> elemento.contains("w")));

        //Retorna true se algum dos elementos possuem a letra 'a' minúscula no nome
        //Funciona igual ao allMatch() mas retorna true se PELO MENOS UM elemento for true para a expressão inserida
        System.out.println("Tem algum elemento com letra 'a' minúscula no nome? " + estudantes.stream().anyMatch( (elemento) -> elemento.contains("a")));

        //Retorna true se nenhum elemento possue a letra 'a' minúscula no nome
        //É a inversão do allMatch(), aplica a expressão lambda a todos os elementos
        //Se o resultado da expressão for false para TODOS os elementos, retorna true
        System.out.println("Não tem nenhum elemento com 'a' minúscula no nome? " + estudantes.stream().noneMatch( (elemento) -> elemento.contains("a")));

        //Retorna o primeiro elemento da coleção, se existir exibe no console
        //findFirst() retorna um optional (vazio ou presente)
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        //Como quase todos os metodos da API stream retornam outro stream você pode encadear uma operação seguida da outra
        //Operações paralelas!
        System.out.print("Operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map( estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter( estudante -> estudante.toLowerCase().contains("r"))
        .collect(Collectors.toList()));
        //.collect(Collectors.joining(", "))); //retorna uma unica string separada pelo delimitador informado
        //.collect(collectors.toSet())); //retorna um set
        //.collect(Collectors.groupingBy ( estudante -> estudante.substring(estudante.indexOf("-") + 1))));
        //groupingBy é um agrupamento que funciona similar ao agrupamento do SQL


    }

    private static void AtividadeStreamAPI() {
        //Utilizando uma lista com um objeto complexo (Estudante, por exemplo) realiza as seguintes operações.
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Marcos", 'M', 16));
        alunos.add(new Aluno("Gabriel", 'M', 16));
        alunos.add(new Aluno("Sara", 'F', 15));
        alunos.add(new Aluno("Angelica", 'F', 18));
        alunos.add(new Aluno("Sandra", 'F', 15));

        //A) Transforme cada estudante em uma String com os atributos do objeto.
        //Usando reduce
        String sAlunos = alunos.stream()
                .map(aluno -> aluno.getNome() + " - " + aluno.getIdade() + " - " +  aluno.getSexo() + "\n")
                .reduce("", String::concat);

        //Usando o join
        String ssAlunos = alunos.stream()
                .map(aluno -> aluno.getNome() + " - " + aluno.getIdade() + " - " +  aluno.getSexo())
                .collect(Collectors.joining("\n"));
        System.out.println(ssAlunos);

        //B) Conte a quantidade de estudantes tem em na coleção.
        System.out.println("A quantidade de alunos no sistema é: " + alunos.stream().count());

        //C) Filter estudantes com idade igual ou superior a 18 anos.
        System.out.println("Alunos com idade maior ou igual a 18 anos.");
        alunos.stream()
                .filter(aluno -> aluno.getIdade() >= 18)
                .forEach(a -> System.out.println(a.getNome() + " - " + a.getIdade()));

        //D) Exiba cada elemento no console.
        System.out.println("Todos os Alunos no sistema");
        alunos.stream()
                .map(aluno -> aluno.getNome() + " | " + aluno.getIdade())
                .forEach(System.out::println);

        //E) Retorne estudantes com nome que possui a letra B.
        System.out.println("Alunos com nome que possui a letra B");
        alunos.stream()
                .filter(aluno -> aluno.getNome().toLowerCase().contains("b"))
                .forEach(aluno -> System.out.println(aluno.getNome()));
        //F) Retorne se existe ao menos um estudante com a letra D no nome.
        System.out.println("Existem alunos com a letra D no nome? " + alunos.stream()
                .anyMatch(aluno -> aluno.getNome().toLowerCase().contains("d"))
        );

        //G) Retorne o estudante mais velho (maior idade) da coeleção. Retorne o mais novo também.
        alunos.stream()
                .max(Comparator.comparingInt(aluno -> aluno.getIdade()))
                .ifPresent(aluno -> System.out.println(
                        "Aluno com maior idade é " +
                        aluno.getNome() +
                                " e sua idade é " +
                                aluno.getIdade()
                        )
                );

        alunos.stream()
                .min(Comparator.comparingInt(aluno -> aluno.getIdade()))
                .ifPresent(aluno -> System.out.println(
                        "Aluno com menor idade é " +
                                aluno.getNome() +
                                " e sua idade é " +
                                aluno.getIdade()
                        )
                );

    }

    //map cria um novo stream que pode ser manipulado depois
    //isso também pode ser resolvido usando
    //Stream.of(numeros).forEach(numero -> System.out.println(numero*2));
    private static void DobraOsNumeros(Integer... numeros){
        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }

}

class Aluno{
    private String nome;
    private char sexo;
    private int idade;

    public Aluno(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
