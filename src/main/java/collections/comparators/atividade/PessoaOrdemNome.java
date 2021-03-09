package collections.comparators.atividade;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PessoaOrdemNome implements Comparator<Pessoa> {
    //private final char[] ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private final Map<Character, Integer> ALFABETO = new HashMap<>();

    public PessoaOrdemNome() {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alfabeto.length(); i++) {
            this.ALFABETO.put("ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(i), i + 1);
        }
    }

    @Override
    public int compare(Pessoa o1, Pessoa o2) {

        char o1Char = o1.getNome().charAt(0);
        char o2Char = o2.getNome().charAt(0);
        if (ALFABETO.get(o1Char) > ALFABETO.get(o2Char)) {
            return 1;
        } else if (ALFABETO.get(o1Char) < ALFABETO.get(o2Char)) {
            return -1;
        } else { //TODO:Caso a letra seja igual decidir qual fica mais em cima
            return 0;
        }
    }
}
