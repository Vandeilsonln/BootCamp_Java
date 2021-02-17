package ProcessamentoPararelo;

public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGerarPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraCarregamento = new BarraDeCarregamento(iniciarGerarPDF);

        iniciarGerarPDF.start();
        iniciarBarraCarregamento.start();

    }
}

class GeradorPDF extends Thread{

    @Override
    public void run() {
        try{
            System.out.println("Iniciando Geração de PDF");
            Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread gerarPDF;

    public BarraDeCarregamento(Thread gerarPDF){
        this.gerarPDF = gerarPDF;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(!gerarPDF.isAlive()){
                break;
            }
            System.out.println("Loading...");
        }

    }
}