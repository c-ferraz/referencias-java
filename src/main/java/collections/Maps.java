package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //exemploHashMap();
        //exemploTreeMap();
        //exemploHashTable();
    }

    private static void exemploHashMap(){

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //atualiza o valor apra a chave Brasil
        campeoesMundialFifa.put("Brasil", campeoesMundialFifa.get("Brasil")+1);

        System.out.println(campeoesMundialFifa);

        //retorna a argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //retorna se existe ou não um campeão França
        System.out.println("Contém França? " + campeoesMundialFifa.containsKey("França"));

        //remove o campeão França
        campeoesMundialFifa.remove("França");

        //retorna se existe ou não um campeão França
        System.out.println("Contém França? " + campeoesMundialFifa.containsKey("França"));

        //retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        //retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        //navega pelos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }

        //navega nos registros do mapa
        for (String key : campeoesMundialFifa.keySet()){
            System.out.println(key + " --- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Verifica se o mapa contém a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //verifica se o mapa contém o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());
    }

    private static void exemploTreeMap(){

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //retorna a última capital no final da árvore
        System.out.println(treeCapitais.lastKey());

        //retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //retorna a ultima capital no final da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        //exibe todas as capitais no console
        System.out.println(treeCapitais);

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();//o chave/valor são removidos nesse momento
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();//a chave/valor são removidos nesse momento

        //retorna a primeira capital no topo da árvore, removendo do map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());//pode ser reutilizado, pois já está separado da árvore

        //retorna a primeira capital no final da árvore, removendo do map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());//pode ser reutilizado, pois já está separado da árvore

        //exibe todas as capirais no console
        System.out.println(treeCapitais);

        //navega em todas as chaves do iterador
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        for (String capital : treeCapitais.keySet()){
            System.out.println(capital + " -- " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }

    }

    private static void exemploHashTable(){
        //hashtable é sincronizado, pode ser usado em varias threads

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //adiciona uma entrada no hashtable
        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //remove um estudante no índice 0
        estudantes.remove("Pedro");

        System.out.println(estudantes);

        //recupera um estudante no índice 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);

        //exibe o tamanho da hashtable
        System.out.println(estudantes.size());

        //navega no hashtable
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : estudantes.keySet()){
            System.out.println(key + " -- " + estudantes.get(key));
        }
    }

}
