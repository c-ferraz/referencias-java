package fundamentos.condicionais;

public class Switchs {
    public static void main(String[] args) {
        //um switch é uma analise de uma variavel entre uma lista de possiveis resultados
        System.out.println("Exemplo switch 1:");
        String variavel = "Olá mundo";
        switch (variavel){
            case "Caso 1":
                System.out.println("Caso 1");
                break;
            case "Caso 2":
                System.out.println("Caso 2");
                break;
            case "Olá mundo":
                System.out.println(variavel);
                break;
        }

        //É necessario ter um break para cada case, caso contrario todas as condições abaixo delá serão executadas!
        System.out.println("\nExemplo switch sem break");
        switch (variavel){
            case "Case 1":
                System.out.println("Case 1"); //ele não exibe esse primeiro pois o case não é o esperado
            case "Olá mundo":
                System.out.println(variavel);
            case "Case 2":
                System.out.println("Case 2");
        }

        //Existe também o default, que é quando o resultado esperado não é encontrado em nenhum dos cases
        System.out.println("\nExemplo switch com default");
        switch (variavel){
            case "Case 1":
                System.out.println("Case 1");
                break;
            case "Case 2":
                System.out.println("Case 2");
                break;
            case "Case 3":
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Esta é a opção default.");
                break;
        }

        //Dentro de um switch você pode executar o código que quiser desde que ele esteja entre o case e o break;
        System.out.println("Exemplo switch 2");
        switch (variavel){
            case "Olá mundo":
                for (char c: variavel.toCharArray()) {
                    System.out.println(c);
                }
                break;
            case "Caso 2":
                System.out.println("Nada");
                break;
            case "Caso 3":
                break;
            default:
                System.out.println("Isto é o default");
                break;
        }

    }
}
