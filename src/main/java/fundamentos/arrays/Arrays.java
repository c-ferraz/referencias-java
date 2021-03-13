package fundamentos.arrays;

public class Arrays {
    public static void main(String[] args) {
        //Arrays são estruturas indexadas e imutáveis, uma vez criadas o tamanho não pode ser alterado
        // Declaração de uma array com itens
        // Estrutura TipoDoArray[] nomeDaVariavel = new TipoDoArray[]{valor1,valor2,valor3,...};
        int[] arrayComItens = new int[]{1,2,3,4,5,6,7,8,9,10};

        // Declaração de um array vazio
        // Estrutura TipoDoArray[] nomeDaVariavel = new TipoDoArray[tamanh_do_array];
        int[] arraySemItens = new int[10];

        // Acessar elementos do array
        // Para acessar um elemento do array você precisa indicar o índice que vai ser modificado
        // Indices de array começam em 0 e vão até o número de elementos - 1
        System.out.println("Primeiro item do array: " + arrayComItens[0] + "\n" +
                "Segundo item do array: " + arrayComItens[1] + "\n" +
                "Ultimo item do array: " + arrayComItens[arrayComItens.length-1]);

        // Para alterar o valor de um elemento do array é igual a atribuição de variavel mas utilizando o índice
        System.out.println("Valor anterior: " + arrayComItens[5]);
        arrayComItens[5] = 99;
        System.out.println("Novo valor: " + arrayComItens[5]);
        // É possivel utilizar os elementos do mesmo jeito que variaveis, entretando o array em si não pode ser alterado

        // O valor padrão de um item de um array é o mesmo do valor padrão do tipo dele
        // Um array de inteiros "vazio" tera todos os valores definidos para 1
        // Enquanto um array de objetos tera todos os valores definidos para null
        System.out.println("Exemplo índice de array int vazio: " + arraySemItens[4]);
        String[] arrayDeStrings = new String[5];
        System.out.println("Exemplo índice de array string vazio: " + arrayDeStrings[3]);

        // Para percorrer um array você pode utilizar qualquer laço de repetição (geralmente o for)
        // É necessario apenas um contador que incremente (ou decremente) a cada iteração do laço
        // No caso do for a variavel interna pode ser usada para acessar o array, ex:
        System.out.print("Exemplo laço for: ");
        for (int i = 0; i < arrayComItens.length; i++) {
            System.out.print(arrayComItens[i] + " ");
        }
        System.out.println();

        // O foreach também pode ser usado para percorrer fundamentos.arrays sem o usod e um contador
        System.out.print("Exemplo laço foreach");
        for (int numero:arrayComItens) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // No caso do while você deve criar um contador fora do laço e incrementar ele manualmente ex:
        int contador = 0; //o valor inicial do índice a ser acessado
        System.out.print("Exemplo laço while: ");
        while (contador < arrayComItens.length){
            System.out.print(arrayComItens[contador] + " ");
            contador++; //incrementa +1 ao contador a cada iteração do laço
        }
        System.out.println();
    }
}
