package veiculos;

public class Exemplo001 {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.setQuantidadeDePortas(4);
        carro.setMarca("Nissan");
        carro.setModelo("March");

        Motocicleta moto = new Motocicleta();
        moto.setMarca("Ducati");
        moto.setModelo("StreetFighter");
        moto.setCilidradas(850);
    }
}
