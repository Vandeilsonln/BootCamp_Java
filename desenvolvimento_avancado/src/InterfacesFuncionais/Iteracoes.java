package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args){
        String[] nomes ={"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java", "João"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirDobroFor(numeros);
        imprimirDobroDosNumeros(numeros);

        List<String> listaProfissoes = new ArrayList<>();
        listaProfissoes.add("Desenvolvedor");
        listaProfissoes.add("Testador");
        listaProfissoes.add("Ger. Projeto");
        listaProfissoes.add("Ger. Qualidade");

        listaProfissoes.stream()
                .filter(i -> i.startsWith("Ger."))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for (int i =0; i < nomes.length; i++){
            if(nomes[i].equals("João")){
                nomesParaImprimir += nomes[i];
            }
        }

        System.out.println(nomesParaImprimir);


        String nomesStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());

        System.out.println(nomesStream);
    }

    public static void imprimirDobroDosNumeros(Integer... numeros){
        Stream.of(numeros)
                .map(num -> num*2)
                .forEach(System.out::println);
    }

    public static void imprimirDobroFor(Integer... num){
        for(Integer i : num){
            System.out.println(i*2);
        }
    }
}
