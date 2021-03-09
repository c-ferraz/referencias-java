package interfaces.funcionais;

public class FuncaoAltaOrdem {
    //Uma função de alta ordem é uma função que retorna uma função ou recebe um função como parametro
    //Como o java não é uma linguagem funcional devemos usar uma interface funcional
    //como parametro da função
    public static void main(String[] args) {
        //Definindo operações a serem realizadas
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo MULTIPLICACAO = (a, b) -> a*b;
        Calculo DIVISAO = (a, b) -> a/b;

        System.out.println("Soma 1+3: " + executarOperação(SOMA, 1, 3));
        System.out.println("Subtração 1-3: " + executarOperação(SUBTRACAO, 1, 3));
        System.out.println("Multiplicação 2*2: " + executarOperação(MULTIPLICACAO, 2, 2));
        System.out.println("Divisão 6/2: " + executarOperação(DIVISAO, 6, 2));
    }

    public static int executarOperação(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

//interface funcional
//lembrando que uma interface funcional so pode ter um metodo abstrato
interface Calculo{
    public int calcular(int a, int b);
}