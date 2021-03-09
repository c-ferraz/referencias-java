package fundamentos.laços;

public class For {
    public static void main(String[] args) {
        //Laços for são muito usados para percorrer coleções (fundamentos.arrays, lists, sets, etc.)

        //for padrão com contador interno
        //primeiramente se declara a variavel interna que vai ser o contador (nesse caso a variavel contador)
        //depois separado por ponto e virgula ; a condição para parar o laço
        //e por ultimo o aumento/diminuição do contador
        System.out.println("Exemplo laço for");
        for (int contador = 1; contador < 10; contador++) {
            System.out.println("Repetição do " + contador + " laço.");
        }

        //você pode aumentar ou diminuir valores do contador como quiser
        System.out.println("\nExemplo incrementando o contador de 2 em 2");
        for (int contador = 0; contador < 10; contador = contador + 2){
            System.out.println("Valor do contador: " + contador);
        }

        //a variavel interna pode ter qualquer nome
        System.out.println("\nExemplo diminuindo valor do contador");
        for (int i = 10; i > 0; i = i -1) {
            System.out.println("Valor do contador: " + i);
        }

        System.out.println("\nExemplo for-each");
        int[] valores = {5,686,45,10,2};
        //Usado para percorrer coleções (ex: array ou list)
        //ele vai percorrer todos os valores da coleção executando o código dentro do bloco de execução
        //primeiramente você deve indicar o tipo de objeto que vai ser manipulado (nesse caso int) e dar um nome a ele (está é uma variável local)
        //depois você deve informar a coleção a qual vai estar percorrendo separada por dois pontos
        for (int valor : valores){
            System.out.println("O valor encontrado dentro do array foi: " + valor);
        }

        //exemplo for-each com array de strings
        System.out.println("\nExemplo for-each 2");
        String[] nomes = {"Carlos", "Pedro", "Jóse"};
        for (String nome :nomes) {
            System.out.println("O valor encontrado dentro do array foi: " + nome);
        }

        System.out.println("\nExemplo continue e break");
        //você também pode usar continue e break dentro de fundamentos.laços for
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                continue;
            }
            if (i == 8){
                break;
            }
            System.out.println("O valor da váriavel i é: " + i);
        }
    }
}
