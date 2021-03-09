package collections.comparators.atividade;

import java.time.LocalDate;
import java.util.*;

public class AppComparator {
    public static void main(String[] args) {

        //Crie uma lista de objetos complexos
        List<Pessoa> pessoas = new ArrayList<>();

        //Adicione elementos nessa lista
        pessoas.add(new Pessoa("Maria", LocalDate.parse("2000-01-12"), 'F'));
        pessoas.add(new Pessoa("Carlos", LocalDate.parse("1997-05-06"), 'M'));
        pessoas.add(new Pessoa("João", LocalDate.parse("2005-08-24"), 'M'));
        pessoas.add(new Pessoa("Carla", LocalDate.parse("1999-03-12"), 'F'));
        pessoas.add(new Pessoa("Ana", LocalDate.parse("1994-11-02"), 'F'));

        System.out.println("Ordene implementando a interface java.util.Comparator no seu objeto complexo");
        Collections.sort(pessoas, new PessoaOrdemNome());
        for (Pessoa p:pessoas) {
            System.out.println(p.getNome());
        }

        System.out.println("Ordene implementando um novo objeto com a interface java.util.Comparable");
        Collections.sort(pessoas);
        for (Pessoa p:pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

        System.out.println("Ordene usando uma expressão lambda na chamada de suaLista.sort()");
        System.out.println("\n\n");

        System.out.println("Ordene usando referências de métodos e os métodos estáticos de Comparator");
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        for (Pessoa p:pessoas) {
            System.out.println(p.getNome() + " - " + p.getIdade());
        }

        System.out.println("Ordene coleções TreeSet e TreeMap");


    }
}
