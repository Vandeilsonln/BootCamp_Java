package InterfacesFuncionais;

public class FuncaoAltaOrdem {
    public static void main(String[] args){
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo divisao = (a,b) -> a/b;
        Calculo multiplacao = (a,b) -> a*b;

        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,5,3));
        System.out.println(executarOperacao(divisao,9,3));
        System.out.println(executarOperacao(multiplacao,2,3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}
