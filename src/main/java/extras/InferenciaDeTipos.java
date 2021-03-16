package extras;

import java.util.function.Function;

public class InferenciaDeTipos {
    public static void main(String[] args) {
        // Inferencia de variaveis usando a keyword var
        var minhaVariavel = 0;
        // O Java já entende que o valor ali deve ser inteiro devido a declaração
        // Sendo assim a keyword var, so pode ser usada em variaveis inicializadas
        // Você também não pode alterar o tipo de variavel após a declaração
        // minhaVariavel = "valor"; // Vai resultar em um erro de compilação
        var pessoa = new Pessoa("João", 18);
        // var também funciona em objetos complexos
        Pessoa pessoa2 = createPessoa("Maria", 18);

        // var só pode ser declarado no contexto Local, ou seja contido dentro de um método, try/catch, laço, etc.

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());

        // var também pode ser usado dentro de expressões lambda
        Function<Integer, Double> dividirPor2 = (var numero) -> numero/2.0;
        System.out.println(dividirPor2.apply(15));
    }

    /*
    public var createPessoa(){

    }*/ // var não pode ser usado como retorno de métodos

    /*
    public Pessoa createPessoa(var nome, var idade){

    }*/ // var também não pode ser usado como tipo do parametro

    public static Pessoa createPessoa(String nome, int idade){
        var minhaPessoa = new Pessoa(nome, idade);
        return minhaPessoa;
    } // Mas é possivel criar um var dentro do método e retorna-lo
}

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome + " | Idade: " + String.valueOf(this.idade) + ".";
    }
}
