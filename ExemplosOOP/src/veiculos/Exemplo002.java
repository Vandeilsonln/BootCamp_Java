package veiculos;

public class Exemplo002 {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.setModelo("Fiat");
        carro.setMarca("Uno");
        carro.acelera();

        Motocicleta moto = new Motocicleta();
        moto.setModelo("125");
        moto.setMarca("Biz");
        moto.acelera();
    }
}
