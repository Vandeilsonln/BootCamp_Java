package veiculos;

public class Motocicleta extends Veiculo{
    private int cilindradas;

    public int getCilidradas() {return cilindradas;}
    public void setCilidradas(int cilindradas) {this.cilindradas = cilindradas;}

    public double calculaImposto(){
        return this.getvalorVenal() * 0.03;
    }
}
