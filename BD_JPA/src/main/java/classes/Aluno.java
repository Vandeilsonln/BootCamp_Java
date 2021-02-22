package classes;

import javax.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_aluno;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @ManyToOne(fetch = FetchType.EAGER)
    private Estado id_estado;

    // Construtores
    public Aluno(){}
    public Aluno(String nome, int idade, Estado estado){}

    // Getters e Setters
    public int getId_aluno(){return id_aluno;}
    public void setId_aluno(int id_aluno) {this.id_aluno = id_aluno;}

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public Estado getId_estado(){return id_estado;}
    public void setId_estado(Estado id_estado){this.id_estado = id_estado;}

    @Override
    public String toString() {
        return "Id:\t" + this.id_estado + "\tNome:\t" + this.nome + "\tIdade:\t" + this.idade + "\tEstado:\t" + this.id_estado;
    }
}
