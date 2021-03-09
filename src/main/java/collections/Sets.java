package collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        //exemploHashSet();
        //exemploLinkedHashSet();
        //exemploTreeSet();
        //exercicio();

        HashSet<Integer> teste = new HashSet<>();

        teste.add(2);
        teste.add(4);
        teste.add(55);
        teste.add(14);
        teste.add(23);

        System.out.println(teste);
        teste.add(44);
        System.out.println(teste);
    }

    static private void exemploHashSet(){
        //TODO: Olhar metodo hashCode()
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);

        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota : notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }

    static private void exemploLinkedHashSet(){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int inteiro: sequenciaNumerica) {
            System.out.println(inteiro);
        }
        //sequenciaNumerica.clear();
        System.out.println(sequenciaNumerica.isEmpty());
    }

    static private void exemploTreeSet(){
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a árvore com capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizon");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        //retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixa na árvore de capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        //navega em todos os itens do iterador
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String capital:treeCapitais){
            System.out.println(capital);
        }
    }

    static private void exercicio(){

        System.out.println("Exercício usando HashSet");
        //Crie um Set e execute as seguintes operações
        HashSet<Integer> listaNumeros = new HashSet<>();
        //adiciona 5 números inteiros: 3, 88, 20, 44, 3
        listaNumeros.add(3);
        listaNumeros.add(88);
        listaNumeros.add(20);
        listaNumeros.add(44);
        listaNumeros.add(3);

        //navegue pelo set exibindo cada número no console
        for(Integer numero : listaNumeros){
            System.out.println("----*" + numero);
        }

        //remove o primeiro item do Set
        listaNumeros.remove(3);

        //adicione um novo número no Set:23
        listaNumeros.add(23);

        //verifique o tamanho do Set
        System.out.println("Tamanho do set: " + listaNumeros.size());

        //verifique se o set está vazio.
        System.out.println("O set está vazio? " + listaNumeros.isEmpty());

        System.out.println("Exercício usando TreeSet");
        TreeSet<Integer> arvoreNumeros = new TreeSet<>();

        arvoreNumeros.add(3);
        arvoreNumeros.add(88);
        arvoreNumeros.add(20);
        arvoreNumeros.add(44);
        arvoreNumeros.add(3);

        Iterator<Integer> iterator = arvoreNumeros.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        arvoreNumeros.pollFirst();

        arvoreNumeros.add(23);

        System.out.println("Tamanho do TreeSet: " + arvoreNumeros.size());

        System.out.println("O TreeSet está vazio? " + arvoreNumeros.isEmpty());

    }
}
