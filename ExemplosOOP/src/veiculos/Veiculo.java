package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private double valorVenal;

    public double getvalorVenal() {return valorVenal;}
    public void setValorVenal(double valorVenal) {this.valorVenal = valorVenal;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public void acelera() {System.out.println(marca + " " + modelo + " está acelerando...");}

    public double calculaImposto(){
        return this.valorVenal * 0.01;
    }
}
