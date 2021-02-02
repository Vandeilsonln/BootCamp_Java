package ExercicioCarro;

public class Carro {
    public Carro(String marca, String modelo, String ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String marca;
    public String modelo;
    public String ano;
    private String variante;

    public String getVariante(){return variante;}
    public void setVariante(String variante){this.variante = variante;}

    public String fazerRevisao(){return "Fazendo Revisão";}
}
