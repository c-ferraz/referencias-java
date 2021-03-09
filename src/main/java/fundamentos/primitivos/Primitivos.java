package fundamentos.primitivos;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Primitivos {
    public static void main(String[] args) {
        /*
         *  Os tipos primitivos são tipos os tipos de dados mais basicos do java existem 8 deles:
         *  boolean, guarda valores verdadeiro ou falso
         *  char, guarda um unico caractere (pode ser qualquer Unicode)
         *  byte, números inteiros (de até 8 bits de tamanho)
         *  short, numeros inteiros (de até 16 bits de tamanho)
         *  int, números inteiros (de até 32 bits de tamanho)
         *  long, números inteiros (de até 64 bits de tamanho)
         *  float, números decimais precisão simples (32 bits, até 7 digitos após a virgula)
         *  double, números decimeais precisão dupla (64 bits, até 15 digitos após a virgula)
         * */

        // Exemplo declaração tipos primitivos:
        // Os tipos primitivos são sempre em minusculo!
        boolean exemploBool = false; //Aceita apenas true ou false
        char exemploChar = 'A'; //Um unico caractere entre aspas simples
        // Os exemplos abaixo apontam os valores maximos que podem ser armazenados nos seguintes tipos
        byte exemploByte = 127;
        short exemploShort = 32767;
        int exemploInt = 2147483647;
        // É usado um L no final para indicar que ele é do tipo long, de preferencia usar L maiusculo
        long exemploLong = 9223372036854775807L;
        // Tipos de ponto flutuante
        float exemploFloat = 12.1234567f; // É usuado um f no final para indicar que é do tipo float
        double exemploDouble = 1.123456789012345;

        // No caso de inteiros exceder o valor máximo do tipo vai resultar em um erro
        // Tipos de ponto flutuante vão ser truncados (dados são perdidos são perdidos), ex:

        System.out.println("Valor float truncado: " + 1.1234567890f);
        System.out.println("Valor float correto: " + 1.1234567f);

        // É possivel converter valores de um tipo para o outro usando uma Classe empacotadora ou um cast
        // Exemplo conversão com classe empacotadora
        // int para float
        int intParaConversao = 10;
        float conversaoFloat = Float.valueOf(intParaConversao);
        System.out.println("O valor original em int é: " + intParaConversao + "\nE o valor convertido é: " + conversaoFloat);
        // Um cast é representado pelo tipo entre parenteses antes do valor/variavel
        System.out.println("Cast de inteiro para float: " + (float) 11);
        System.out.println("Cast de float para inteiro: " + (int) 11.5 );

        // No caso de boolean você converter strings pela classe empacotadora
        // Qualquer valor que NÃO seja true (ignora maiúsculas e minúsculas) é convertido para false
        System.out.println("String para boolean: " + Boolean.valueOf("TrUE"));
        System.out.println("String para boolean 2: " + Boolean.valueOf("ValorTrue")); // É false pois a String não contém apenas true

        // É importante lembrar que operações matemáticas que resultam em tipos diferentes dos iniciais vão retornar resultados errados
        int valor1 = 11;
        int valor2 = 3;
        int resultado = valor1/valor2; // Valor truncado pois a variável resultado é do tipo int
        System.out.println("Resultado de 11/3 = " + resultado);
        float resultadoFloat = valor1/valor2; // Valor truncado pois o divisor e dividendo são do tipo int
        System.out.println("Resultado de 11/3 = " + resultadoFloat);
        resultadoFloat =  (float) valor1/valor2; // Valor correto, divisor ou dividendo são do tipo float
        System.out.println("Resultado de 11/3 = " + resultadoFloat);
        resultadoFloat =  valor1/(float) valor2; // Valor correto, divisor ou dividendo são do tipo float
        System.out.println("Resultado de 11/3 = " + resultadoFloat);
    }
}
