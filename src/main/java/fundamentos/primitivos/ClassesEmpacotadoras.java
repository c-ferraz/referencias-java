package fundamentos.primitivos;

import java.sql.SQLOutput;

public class ClassesEmpacotadoras {
    public static void main(String[] args) {
        /*
        * Classes empacotadoras (Wrapper Classes) são "extensões" dos tipos primitivos
        * Uma vez que os tipos primitivos são tipos de dados eles não podem conter métodos
        * Assim usamos classes empacotadoras para realizar algumas operações com esses objetos (ex: conversão)
        * Cada tipo primitivo tem uma classe empacotadora, elas são
        * Boolean, tipo boolean
        * Character, tipo char
        * Byte, classe empacotadora do tipo byte
        * Short, classe empacotadora do tipo short
        * Integer, classe empacotadora do tipo int
        * Long, classe empacotadora do tipo long
        * Float, classe empacotadora do tipo float
        * Double, classe empacotadora do tipo double
        * */

        float exemploMaxFloat = Float.MAX_VALUE;
        System.out.println("Maior número float permitido " + exemploMaxFloat);
        Integer instanciaInteger = 19; // Podemos instanciar um objeto da classe do mesmo modo que criamos um tipo primitivo
        int tipoInt = 19;
        // Utilizando uma instancia de Integer podemos acessar métodos
        System.out.println("Conversão float " + instanciaInteger.floatValue());// Retorna o valor em float
        //System.out.println(tipoInt.floatValue()); // Isso não é premitido, resulta em um erro
        System.out.println("Valor mais alto entre os inteiros 2 e 5: " + Integer.max(2,5)); // Isso retorna o inteiro mais alto entre os 2 fornecidos
        // Cadas classe empacotadora tem diversos métodos, que realizam diversas operações

        // Parse retorna um tipo int
        //System.out.println(Integer.parseInt("10") instanceof Integer); // Isso retorna um erro pois o tipo int
        // valueOf retorna um objeto do tipo Integer
        System.out.println("Integer.valueOf() retorna um objeto Integer? " + (Integer.valueOf("10") instanceof Integer));
        // Isso é permitido, retorna true pois é um objeto Integer

    }
}
