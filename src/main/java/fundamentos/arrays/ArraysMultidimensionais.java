package fundamentos.arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // Nd-Arrays, Arrays de N Dimensões, Array multidimensional ou Matrizes são basicamente fundamentos.arrays dentro de outros fundamentos.arrays
        // Estrutura:
        int[][] exemplo2DArray = new int[2][2];
        /*
        * [[valor][valor]]
        * [[valor][valor]]
        * Representação de um array 2D (também chamado de matriz ou array bidimensional) de 2x2
        * Ele guarda até 4 valores
        * No exemplo2DArray[0] temos um OUTRO array com 2 valores dentro
        * Em exemplo2DArray[0][0] temo um UNICO valor inteiro
        * */
        int[][] exemplo2DArray2 = new int[5][5];
        /*
        * [Valor, Valor, Valor, Valor, Valor]
        * [Valor, Valor, Valor, Valor, Valor]
        * [Valor, Valor, Valor, Valor, Valor]
        * [Valor, Valor, Valor, Valor, Valor]
        * [Valor, Valor, Valor, Valor, Valor]
        * Representação de um array bidimensional de 5x5, ele armazena 25 valores
        * */
        int[][][] exemplo3DArray = new int[2][2][2]; // Array 3d de 2x2x2 que armazena 8 valores
        /*
        * [[Valor, Valor], [Valor, Valor]]
        * [[Valor, Valor], [Valor, Valor]]
        * Um array de 3 dimensões armazena Arrays de Arrays
        * No exemplo3DArray[0] nós temos 2 Arrays de inteiros com 2 valores cada
        * No exemplo3DArray[0][0] nós temos 1 array de inteiros com 2 valores
        * No exemplo3DArray[0][0][0] nós temos 1 valor inteiro
        *
        * */
        // Podemos ter array de N Dimensões
        int[][][][] exemploNDArray = new int[2][2][2][2]; //4 Dimensões
        int[][][][][] exemploNDArray2 = new int[2][2][2][2][2]; //5 Dimensões

        // Para acessar dados é necessario usar varios índices
        exemplo2DArray[0][0] = 1;
        exemplo2DArray[0][1] = 2;
        exemplo3DArray[0][0][0] = 1;
        //exemplo3DArray[0][0] = 1;
        // O código na linha acima vai causar um erro pois o tipo de valor contido no indice [0][0]
        // é um array e não um inteiro

        // No exemplo abaixo percorremos o array inteiro e contamos a quantidade de valores dentro dele
        int contador = 0;
        System.out.println("Vizualização de um Array de 3 dimensões: ");
        for (int x = 0; x < exemplo3DArray.length; x++){
            System.out.print("[");
            for (int y = 0; y < exemplo3DArray[x].length; y++){
                System.out.print("[");
                for (int z = 0; z < exemplo3DArray[x][y].length; z++){
                    contador++;
                    System.out.print(exemplo3DArray[x][y][z]);
                    if (z != exemplo3DArray[x][y].length-1){
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (y != exemplo3DArray[x].length-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("Quantidade de valores armazenados no exemplo3DArray: " + contador);

        // Você pode encadear varios foreach também
        int contador2 = 0;
        for (int[] array: exemplo2DArray) {
            for (int valor : array){
                contador2++;
            }
        }
        System.out.println("Quantidade de valores armazenados no exemplo2DArray: " + contador2);
    }
}
