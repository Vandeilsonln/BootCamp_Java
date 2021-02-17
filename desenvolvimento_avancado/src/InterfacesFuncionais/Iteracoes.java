package InterfacesFuncionais;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args){
        String[] nomes ={"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java", "João"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
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
}
