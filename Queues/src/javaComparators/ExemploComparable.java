package javaComparators;

public class ExemploComparable implements Comparable<ExemploComparable> {

    private final String nome;
    private final Integer idade;

    public ExemploComparable(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {return this.nome;}
    public Integer getIdade() {return this.idade;}

    @Override
    public int compareTo(ExemploComparable o) {
        return this.getIdade() - o.getIdade();
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }
}
