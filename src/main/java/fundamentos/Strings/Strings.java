package fundamentos.Strings;

public class Strings {
    public static void main(String[] args) {
        /*
        * Strings são resumidamente uma coleção imutável de caracteres
        * O imutável indica que você não pode alterar a String original, apenas sobscrever seu valor com outro
        * */

        // String NÃO é um tipo primitivo!
        String exemploString = "Olá Mundo";

        // Para concatenar Strings podemos usar o simbolo + ou o método String.concat()
        System.out.println(exemploString + " Valor concatenado.");
        System.out.println(exemploString.concat(" Valor concatenado com .concat()"));

        //Existem diversos metodos na classe String, alguns exemplos:
        System.out.println(exemploString.toUpperCase()); // Transforma todas as letras em maiusculo
        System.out.println("Mesmo colocando todas as letras em máiusculo o valor original da String não muda: " + exemploString);
        System.out.println("Isso acontecen PoIs ela é Imutavel, para trocar o valor dela temos que atribuir outro valor a váriavel".toLowerCase());
        exemploString = exemploString.toUpperCase();
        System.out.println("Novo valor de exemploString: " + exemploString);

        // Como strings são uma coleção de caracteres podemos acessar seus caracteres usando seu índice, que nem um array normal
        System.out.println("Caractere no índice 0 da string: " + exemploString.charAt(0));
        System.out.println("Caractere no índice 1 da string: " + exemploString.charAt(1));
        // O método charAt retorna um char

        // Podemos ver o tamanho da String
        System.out.println("Qual o tamanho da String na variavel exemploString? " + exemploString.length());

        // Podemos selecionar pedaços da String usando o método substring
        // variavelString.substring(índiceInicial, índiceFinal)
        System.out.println("3 primeiras letras da String: " + "'"+exemploString.substring(0,3)+"'");
        // Os índices começam no valor 0 e o índiceFinal não inclui o valor dele
        // No exemplo acima selecionamos os valores nas posições 0,1 e 2 da String (índiceInicial = 0 e IndiceFinal = 3)
        // Caso não seja índicado o índiceFinal ele vai até o fim da String (seu length()-1)
        System.out.println("Letras a partir do índice 3: " + "'"+exemploString.substring(3)+"'");
        // Note que existe um espaço vázio pois espaços vazios também são considerados caracteres
        char exemploChar = ' ';
        // O retorno do método substring é uma outra String
        //exemploChar = exemploString.substring(0,1); //Isso retorna um erro mesmo que eu esteja selecionando um unico caractere

        exemploString = "Valor para comparação!";
        // Comparando Strings
        // String.contains() verifica se o valor informado está dentro da String, ele é case sensitive (maiúsculas e minúsculas fazem diferença)
        System.out.println("exemploString contém a palavra 'Valor'? " + (exemploString.contains("Valor")));
        System.out.println("exemploString contém a palavra 'VAlor'? " + (exemploString.contains("VAlor")));
        // Qualquer sequencia de caracteres podem ser usadas e eles podem estár em qualquer posição da String
        System.out.println("exemploString contém a palavra 'lor'? " + (exemploString.contains("lor")));

        // String.equals() verifica se o valor informado é exatamente igual ao da String, ele é case sensitive
        System.out.println("O valor de exemploString é igual á 'Valor para comparação!'? " + (exemploString.equals("Valor para comparação!")));
        System.out.println("O valor de exemploString é igual á 'Valor Para comparação!'? " + (exemploString.equals("Valor Para comparação!")));
        System.out.println("O valor de exemploString é igual á 'Valor'? " + (exemploString.equals("Valor")));
        // Temos o método String.equalsIgnoreCase() para ignorar case sensitivity na comparação
        System.out.println("O valor de exemploString é igual á 'Valor Para comparação!'? " + (exemploString.equalsIgnoreCase("Valor Para comparação!")));

        // Pesquisando índice dentro da String
        // Usando String.indexOf() podemos pesquisar índices dentro da String, esse método é case sensitive
        // Ele retorna a primeira ocorrencia da pesquisa dentro da String (o índice mais baixo)
        System.out.println("Qual o índice da primeira letra 'a' da String? " + exemploString.indexOf('a'));
        // indexOf() aceita valores String e char
        System.out.println("Qual o índice da primeira letra 'r' da String? " + exemploString.indexOf("r"));
        // Podemos pesquisar uma String de varias letras também, ele retorna o índice inicial da sua String de pesquisa
        System.out.println("Qual o índice da primeir palavra 'para' da String? " + exemploString.indexOf("para"));
        // Caso não seja encontrado o valor dentro da String ele retorna -1
        System.out.println("Qual o índice da primeira palavra 'palavra'? " + exemploString.indexOf("palavra"));
        // Podemos pesquisara dentro de uma substring também
        System.out.println("Exemplo índexOf() com substring()" + exemploString.substring(6).indexOf("para"));
        /*
        * O retorno é 0 pois estamos pequisando dentro de uma String que começa no índice 6 de exemploSubstring e
        * vai até o fim dela, ou seja a String de pesquisa é "para comparação!"
        * [V][a][l][o][r][ ][p][a][r][a][ ][c][o][m][p][a][r][a][ç][ã][o][!]
        *  0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21
        * /\ Índices de do String exemploString
        * */
        // Temos também o método String.lastIndexOf()
        // Ele funciona do mesmo jeito que Stirng.indexof() más retorna o índice mais alto
        System.out.println("Qual o índice da ultima letra 'a' da String? " + exemploString.lastIndexOf('a'));
        System.out.println("Qual o índice da ultima palavra 'para' da String? " + exemploString.lastIndexOf("para"));
        // Nesse caso ele retornou 14 pois na posição 14 e nas suas posições seguintes foi encontrado a palavra "para"

        // Podemos verificar se ela está a String está em branco ou vazia
        exemploString = "     "; // Atribuindo valor String em branco a váriavel exemploString
        // String.isBlank() retorna true se todos os espaços dela forem em branco (whitespace)
        System.out.println("A String está em branco? " + exemploString.isBlank());
        // String.isEmpty() retorna true se ela não conter nenhuma valor, nem mesmo espaços em branco
        System.out.println("A String está vazia? " + exemploString.isEmpty());
        exemploString = ""; // Atribuindo valor vazio a váriavel exemploString
        System.out.println("A String está em branco? " + exemploString.isBlank());
        System.out.println("A String está vazia? " + exemploString.isEmpty());
        // Uma String em branco NUNCA está vazia
        // Uma String vazia SEMPRE TAMBÉM está em branco

        exemploString = "Valor para ser quebrado.";
        // Podemos também converter uma String completamente para um array de caracteres
        char[] cArrayExemploString = exemploString.toCharArray();
        for (char c:cArrayExemploString){
            System.out.print(c+"-");
        }
        System.out.println();

        // Podemos quebrar uma String em um array de String usando o método String.split()
        // Ele aceita uma Expressão Regular (regex) como parametro
        // No exemplo abaixo vamos quebrar a String em cada um dos seus espaços
        String[] arrayExemploString = exemploString.split(" ");
        for (int i = 0; i < arrayExemploString.length; i++) {
            System.out.println("Índice " + i + " do arrayExemploString é o valor: " + arrayExemploString[i]);
        }
        System.out.println();
        // Agora vamos quebrar a cada ocorrencia da letra "r"
        arrayExemploString = exemploString.split("r");
        for (int i = 0; i < arrayExemploString.length; i++) {
            System.out.println("Índice " + i + " do arrayExemploString é o valor: " + arrayExemploString[i]);
        }
        System.out.println();
        // Note que ele "come" o valor da pesquisa, ele é perdido ao ser convertido para array
        // Quebrando o array a cada ocorrencia da palavra "para"
        arrayExemploString = exemploString.split("para");
        for (int i = 0; i < arrayExemploString.length; i++) {
            System.out.println("Índice " + i + " do arrayExemploString é o valor: " + arrayExemploString[i]);
        }
        System.out.println();

        // Temos métodos para limpar espaços em branco de uma String, strip(), stripLeading() e stripTrailing()
        exemploString = "   String para ser limpa   ";
        System.out.println("-" + exemploString + "-");
        System.out.println("exemploString.strip() ="+ exemploString.strip() + "-"); // Remove espaços em branco do começo e do fim da String
        System.out.println("exemploString.stripLeading() =" + exemploString.stripLeading() + "-"); // Remove espaços em branco do lado esquerdo (começo) da String
        System.out.println("exemploString.spritTrailing() =" + exemploString.stripTrailing() + "-"); // Remove espaços em branco do lado direito (final) da String

        // Podemos pesquisar e substituir palavras e letras dentro de uma String usando o método String.replace()
        // Ele aceita um unico caractere ou uma sequencia de caracteres (String)
        exemploString = "Exemplo string para troca de palavras";
        System.out.println("String inicial: " + exemploString);
        exemploString.replace("troca", "TROCA"); // Tanto a pesquisa quanto a troca são case sensitive
        System.out.println("Troca de String: " + exemploString); // A troca não foi realizada pois String são imutaveis, então é necessario atribuir o novo valor a variavel exemploString
        exemploString = exemploString.replace("troca", "TROCA");
        System.out.println("Troca de String2: " + exemploString);
        exemploString = exemploString.replace('a', 'O'); // Trocando todas as ocorrencias da letra a minúscula pela letra O maiúscula
        System.out.println("Troca de String3: " + exemploString);

        // Podemos também repetir uma string n vezes usando o método repeat()
        System.out.println("Esse texto vai repetir 5x. ".repeat(5));
    }
}
