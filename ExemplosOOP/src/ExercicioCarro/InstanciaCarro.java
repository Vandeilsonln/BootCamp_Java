package ExercicioCarro;



public class InstanciaCarro {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno", "2011");

        System.out.println(meuCarro.fazerRevisao());
        System.out.println(meuCarro.getVariante());
        meuCarro.setVariante("Não informado pelo cliente");
        System.out.println(meuCarro.getVariante());


    }
}
