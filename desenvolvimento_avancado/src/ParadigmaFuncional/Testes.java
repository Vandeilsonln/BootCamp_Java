package ParadigmaFuncional;

public class Testes {
    public static void main(String[] args){
        Funcao1 myTest = valor -> valor;
        System.out.println(myTest.gerar("Vandeilson"));
    }
}

interface Funcao1 {
    String gerar(String valor);
}
