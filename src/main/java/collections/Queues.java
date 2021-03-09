package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //exemplos();
        exercicio();
    }

    public static void exercicio(){
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegue na fila exibindo cada nome no console.
        Iterator<String> iteratorNomes = nomes.iterator();
        while (iteratorNomes.hasNext()){
            System.out.println(iteratorNomes.next());
        }

        //Retorne o primeiro item da fila, sem removê-lo
        System.out.println("Primero da Fila: " + nomes.peek());
        //Retorne o primeiro item da fila, removendo o mesmo.
        System.out.println("Puxa primeiro da fila: " + nomes.poll());
        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo possui na fila.
        nomes.add("Daniel");
        int contador = 1;
        for (String nome : nomes) {
            if (nome.contentEquals("Daniel")){
                System.out.println("Daniel está na posição " + contador + " da fila.");
            }
            contador++;
        }
        //Retorne o tamanho da lista.
        System.out.println("O tamanho da lista é" + nomes.size());
        //Verifique se a lista está vazia.
        System.out.println("A lista está vazia? " + nomes.isEmpty());
        //Verifique se o nome Carlos está na lista.
        System.out.println("O nome Carlos está na lista? " + nomes.contains("Carlos"));
    }

    public static void exemplos(){
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente: filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iteradorFilaBanco = filaBanco.iterator();

        while (iteradorFilaBanco.hasNext()) {
            System.out.println("-----*" + iteradorFilaBanco.next());
        }

        System.out.println("Tamanho da Fila: " + filaBanco.size());

        System.out.println("Fila está vazia? " + filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }
}
