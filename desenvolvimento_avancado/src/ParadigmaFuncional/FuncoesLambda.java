package ParadigmaFuncional;

public class FuncoesLambda {
    public static void main(String[] args){
        Funcao colocarPrefixoString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoString.gerar("Vandeilson"));
    }
}


