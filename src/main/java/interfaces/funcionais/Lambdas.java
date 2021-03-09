package interfaces.funcionais;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //Estrutura de uma lambda
        //InterfaceFuncional nomeDaVariavel = parametro -> logica
        MinhaFuncao test = valor -> "Resultado: " + valor;
        System.out.println(test.addPrefixo("MyFunction"));

        //Se a função lambda possui mais de uma instrução você deve usar chaves { } para indicar as instruções
        Function funcaoVariasInstrucoes = valor -> {
            String resultado = "Resultado: " + valor;
            String addPontoFinal = resultado+".";
            return addPontoFinal;
        };
        System.out.println(funcaoVariasInstrucoes.apply("funcaoVariasInstrucoes"));

    }
}

//Você pode criar suas propiras interfaces com seus proprios metodos
//Interfaces Funcionais devem ter apenas uma metodo abstrato
//O compilador entende que uma interface que atenda aos pre-requisitos de ser interface funcional é uma interface funcional
@FunctionalInterface //Mas você também pode usar essa anotação para definir uma interface funcional
interface MinhaFuncao {
    String addPrefixo(String valor);


}