package fundamentos.laços;

public class While {
    public static void main(String[] args) {

        //Exemplo while basico
        //while executa a verificação no inicio do bloco de execução
        int contador = 0;
        while (contador < 10){
            contador++;
            if (contador == 10){
                System.out.println("\nFinal do exemplo while.");
            } else {
                System.out.print("Repetição " + contador + " do laço." + " - ");
            }
        }

        //Exemplo do-while
        //do-while executa a verificação ao final do bloco de execução
        contador = 0;
        do {
            contador ++;
            if (contador == 10){
                System.out.println("\nFinal do exemplo do-while.");
            } else {
                System.out.print("Repetição " + contador + " do laço." + " - ");
            }
        } while (contador < 10);

        //exemplo break
        //break pode ser usado para interromper o laço antes de atingir a condição do while
        contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 10){
                System.out.println("\nFinal do exemplo break. O valor do contador é:" + contador);
            } else {
                System.out.print("Repetição " + contador + " do laço." + " - ");
            }
            if (contador == 6){
                System.out.println("\nFinal do exemplo de break. O valor do contador é:" + contador);
                break;
            }
        }

        //exemplo continue
        //continue interrompe o laço atual e inicia a proxima iteração dele
        contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 6) {
                System.out.println("Interrompendo a sexta iteração.");
                continue;
                //Código abaixo do continue não é executado!
            }
            if (contador == 10){
                System.out.println("\nFinal do exemplo continue. O valor do contador é:" + contador);
            } else {
                System.out.print("Repetição " + contador + " do laço." + " - ");
            }

        }

        //continue e break também podem ser usados no do-while


    }

}
