package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Anderson");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(1, "Aline");  // substitui Carlos por Aline
        System.out.println(nomes);

        nomes.remove(5);    // Remove Pedro
        System.out.println(nomes);

        nomes.remove("Anderson");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temPessoa = nomes.contains("Juliana");
        System.out.println(temPessoa);

        System.out.println(nomes.isEmpty());
        System.out.println(nomes.indexOf("João"));
        System.out.println(nomes);

        for (String i: nomes){
            System.out.println("Nome no índice " + nomes.indexOf(i) + " é: " + i);
        }

        Iterator<String> nomeIterator = nomes.iterator();

        while(nomeIterator.hasNext()){
            System.out.println("Via Iterator --> " + nomeIterator.next());
        }

    }
}
