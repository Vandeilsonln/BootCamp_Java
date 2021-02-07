package JavaStreamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args){

        //Cria coleção de estudantes
        List<String> myStudents = new ArrayList<>();

        // add 4 estudantes
        myStudents.add("Vandeilson");
        myStudents.add("Aline");
        myStudents.add("Lucy");
        myStudents.add("Pedro");

        // Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + myStudents.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + myStudents.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor número de letras
        System.out.println("Menor número de letras: " + myStudents.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println(myStudents.stream().filter((student) -> student.toLowerCase().contains("a")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println(myStudents.stream().map(student -> student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

    }
}
