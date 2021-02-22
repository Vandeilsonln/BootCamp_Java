package classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estado;

    @Column(nullable = false)
    private String nome_estado;

    @OneToMany(
            mappedBy = "estado",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )

    private List<Aluno> alunos = new ArrayList<>();

    // Contrutor
    public Estado(){}

    public Estado(String nome_estado){this.nome_estado = nome_estado;}

    // Getters e Setters
    public int getId_estado(){return id_estado;}
    public void setId_estado(int id_estado){this.id_estado = id_estado;}

    public String getNome_estado(){return nome_estado;}
    public void setNome_estado(String nome_estado){this.nome_estado = nome_estado;}

    @Override
    public String toString() {
        return "Id:\t" + this.id_estado + "\tNome:\t" + this.nome_estado;
    }
}
