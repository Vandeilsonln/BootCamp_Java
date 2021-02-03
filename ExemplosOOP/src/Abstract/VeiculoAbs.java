package Abstract;

public abstract class VeiculoAbs {
    private String marca;
    private String modelo;
    private double valorVenal;

    public VeiculoAbs(String modelo, String marca, double valorVenal){
        this.modelo = modelo;
        this.marca = marca;
        this.valorVenal = valorVenal;
    }

    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public double getValorVenal() {return valorVenal;}

    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setValorVenal(double valorVenal) {this.valorVenal = valorVenal;}
}
