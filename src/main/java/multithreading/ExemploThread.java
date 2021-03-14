package multithreading;

public class ExemploThread {
    public static void main(String[] args) {
        GeradorDePDF gerarPDF = new GeradorDePDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(gerarPDF);

        gerarPDF.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorDePDF extends Thread { // Usar o extends permite acesso a methodos da classe Thread

    @Override
    public void run() {
        try {
            System.out.println("Iniciar Geração de PDF");
            Thread.sleep(5000); // "Pausa" a execução a thread por x milisegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PDF Gerado`");

    }
}

class BarraDeCarregamento extends Thread {
    private Thread gerarPDF;

    public BarraDeCarregamento(Thread gerarPDF){
        this.gerarPDF = gerarPDF;

    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
                if (!gerarPDF.isAlive()){ // Verifica se a execução da thread já terminou
                    break;
                }
                System.out.println("Carregando ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
