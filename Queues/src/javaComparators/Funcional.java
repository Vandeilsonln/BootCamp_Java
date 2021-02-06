package javaComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Funcional {
    public static void main(String[] args){
        List<ExemploComparable> estudantes = new ArrayList<>();

        estudantes.add(new ExemploComparable("Pedro", 19));
        estudantes.add(new ExemploComparable("Carlos", 23));
        estudantes.add(new ExemploComparable("Mariana", 21));
        estudantes.add(new ExemploComparable("João", 18));
        estudantes.add(new ExemploComparable("Thiago", 20));
        estudantes.add(new ExemploComparable("Larissa", 21));
        estudantes.add(new ExemploComparable("George", 22));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("--- Ordem natural dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem reversa dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(ExemploComparable::getIdade));
        System.out.println("--- Ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(ExemploComparable::getIdade).reversed());
        System.out.println("--- Ordem reversa dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("--- Ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new ExemploComparator());
        System.out.println("--- Ordem reversa dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

    }
}
