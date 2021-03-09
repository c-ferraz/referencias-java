package extras;

public class Math_Random {
    public static void main(String[] args) {
        //Math.random() retorna um double aleatorio entre 0.0 e 1.0
        //O exemplo abaixo gera 10 números inteiros entre os valores forcenidos
        //Sendo assim (Math.random() * Valor maximo Desejado) + Valor Minimo Desejado)
        int valor_maximo = 100;
        int valor_minimo = 1;
        for (int i = 1; i <= 10; i++){
            System.out.println((int) ((Math.random() * valor_maximo) + valor_minimo));
        }
    }
}
