package Abstract;

public class Carro extends VeiculoAbs{

    private int quantidadeDePortas;

    public Carro(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas){
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {this.quantidadeDePortas = quantidadeDePortas;}
    public int getQuantidadeDePortas() {return quantidadeDePortas;}
}
