package ParadigmaFuncional;

import java.util.function.Function;

public class FuncoesLambda {
    public static void main(String[] args){
        Funcao colocarPrefixoString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoString.gerar("Vandeilson"));
    }
}

@FunctionalInterface
interface Funcao{
    String gerar(String valor);
}
