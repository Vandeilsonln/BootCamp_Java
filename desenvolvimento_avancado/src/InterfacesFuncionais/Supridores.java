package InterfacesFuncionais;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args){
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        System.out.println(suppliers.get());

        Supplier<Pessoa> newTeste = () -> new Pessoa("Vandeilson", 25);
        System.out.println(newTeste.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "João";
        idade = 23;
    }

    public Pessoa(String name, Integer age){
        this.nome = name;
        this.idade = age;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}