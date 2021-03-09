package fundamentos.laços;

public class Laços_aninhandos {
    public static void main(String[] args) {
        //Laços aninhandos é quando temos uma repetição dentro da outra

        //Exemplo com while
        System.out.println("Exemplo while");
        int x = 1, y = 1;
        while (x <= 10){
            System.out.println("Laço 1 repetição: " + x);
            while (y <= 3){
                System.out.println("Laço 2 repetição: " + y);
                y++;
            }
            y = 1;
            x++;

        }

        //exemplo com for
        System.out.println("\nExemplo for");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Laço 1 repetição: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Laço 2 repetição: " + j);
            }
        }


        //você também pode aplicar rótulos (labels) a cada laço para poder controlar a saide deles
        //exemplo break com rótulos
        System.out.println("\nExemplo rotulos");
        primeiro:for (int i = 0; i < 5; i++) {
            System.out.println("laço 1 repetição: " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.println("laço 2 repetição: " + (j + 1));
                for (int k = 0; k < 2; k++) {
                    System.out.println("laço 3 repetição: " + (k + 1));
                    if (i == 3){
                        System.out.println("O laço 1 é interrompido a partir do laço 3.");
                        break primeiro;
                    }
                }
            }
        }


    }
}
