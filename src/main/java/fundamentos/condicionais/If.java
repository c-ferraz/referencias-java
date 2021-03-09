package fundamentos.condicionais;

public class If {
    public static void main(String[] args) {

        //if simples
        System.out.println("Exemplo 1:");
        if (true) {
            System.out.println("Verdadeiro");
        }

        //o estrutura if analisa o conteudo dentro do parentesis para um verdadeiro ou falso (true/false)
        System.out.println("Exemplo 2:");
        if (1 == 1){
            System.out.println("1 é igual a 1");
        }

        /*
        * Os operadores comparativos são:
        * Menor que: <
        * Maior que: >
        * Menor ou igual que: <=
        * Maior ou igual que: >=
        * Igual a: ==
        * Diferente de: !=
        * */
        //Exemplo operadores comparativos
        System.out.println("Exemplo 3:");
        System.out.println("O resultado da expressão '2 < 0' é: " + (2 < 0));
        System.out.println("O resultado da expressão '2 > 0' é: " + (2 > 0));
        System.out.println("O resultado da expressão '2 <= 0' é: " + (2 <= 0));
        System.out.println("O resultado da expressão '2 >= 2' é: " + (2 >= 2));
        System.out.println("O resultado da expressão '2 == 3' é: " + (2 == 3));
        System.out.println("O resultado da expressão '2 != 3' é: " + (2 != 3));

        //operadores logicos
        //eles são usados para juntar 2 ou mais condições
        // e: &&
        // ou: ||
        // inverso: !
        //&& requer que todas as condições sejam verdadeiras para retornar verdadeiro
        //|| requer que ao menos uma condição seja verdadeira para retornar verdadeiro
        //! inverte os valores, no caso == passa a ser !=
        System.out.println("Exemplo 4:");
        System.out.println("A expressão '1 == 1 && 2 == 3' é: " + (1 == 1 && 2 == 3));
        System.out.println("A expressão '1 == 1 || 2 == 3' é: " + (1 == 1 || 2 == 3));
        System.out.println("A expressão '!(1 == 1 && 2 == 3)' é: " + !(1 == 1 && 2 == 3)); //essa expressão é o mesmo de 1 != 1 || 2 != 3
        System.out.println("A expressão '1 != 1 || 2 != 3' é: " + (1 != 1 || 2 != 3));

        //if-else
        //você pode controlar varias possibilidades de if com if-else
        System.out.println("Exemplo 5:");
        if (false){
            System.out.println("Isso não vai ser exibido");
        } else if (true) {
            System.out.println("Isso vai ser exibido");
        } else {
            System.out.println("Isso não vai ser exiibido");
        }
        //Caso o if MAIS acima seja falso o else-if abaixo dele será executado
        //Ele continua executando até encontrar um resultado verdadeiro ou chegar no else
        //O else é o final da execução, ele so ocorre caso nenhuma outra condição seja verdadeira
        //Pode se pensar no if-else como Se (if), Se senão (else if), Senão (else)

        //if ternario
        //O if ternario é uma simples estrutura if definida por condição ? resultado se verdadeiro : resultado se falso
        System.out.println("Exemplo 6:");
        System.out.println("Imprimir A se 1 for igual a 1 se não imprime B");
        System.out.println(1 == 1 ? "A" : "B");
        //Você também pode juntar varios ifs ternarios, basta começar outro condicional no else (após os dois pontos)
        System.out.println(false ? "Falso" : true ? "Verdadeiro" : "Falso");
    }
}
