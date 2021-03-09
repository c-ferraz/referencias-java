package interfaces.funcionais;

import java.util.function.Supplier;

public class SuppliersInterface {
    public static void main(String[] args) {
        // Suppliers não recebem entrada e retornam valores
        // Estrutura: Supplier<TipoDoRetorno> nomeDaVariavel = expressão lambda/method reference
        Supplier<Pessoa> meuSupplier = () -> new Pessoa();
        System.out.println(meuSupplier.get());

        // Exemplo method reference
        meuSupplier = Pessoa::new;
        System.out.println(meuSupplier.get());


    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        this.nome = "João";
        this.idade = (int) (Math.random() * 50);
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, idade: %d", nome,idade);
    }

}
