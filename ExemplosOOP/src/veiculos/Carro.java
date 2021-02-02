package veiculos;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {return quantidadeDePortas;}

    public void setQuantidadeDePortas(int qtdPortas) {this.quantidadeDePortas = qtdPortas;}

    public double calculaImposto(){
        return this.getvalorVenal() * 0.07;
    }
}
