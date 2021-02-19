package part3;

public class Ingrediente {
    private int id_ingrediente;
    private String descricao;
    private float preco;
    private int volume_peso;
    private String unidade_medida;

    public Ingrediente(int id_ingrediente, String descricao, float preco, int volume_peso, String unidade_medida){
        this.id_ingrediente = id_ingrediente;
        this.descricao = descricao;
        this.preco = preco;
        this.volume_peso = volume_peso;
        this.unidade_medida = unidade_medida;
    }

    public Ingrediente(String descricao, float preco, int volume_peso, String unidade_medida) {
        this.descricao = descricao;
        this.preco = preco;
        this.volume_peso = volume_peso;
        this.unidade_medida = unidade_medida;
    }

    public Ingrediente() { }

    public int getId_ingrediente() {return id_ingrediente;}
    public void setId_ingrediente(int id_ingrediente) {this.id_ingrediente = id_ingrediente;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao=descricao;}

    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}

    public int getVolume_peso() {return volume_peso;}
    public void setVolume_peso(int volume_peso) {this.volume_peso=volume_peso;}

    public String getUnidade_medida() {return unidade_medida;}
    public void setUnidade_medida(String unidade_medida) {this.unidade_medida=unidade_medida;}


}
