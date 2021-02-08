package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Funcional_EX001 {
    public static void main(String[] args){
        UnaryOperator<Integer> calcularValor = variavel -> variavel * 3;
        int elemento = 10;
        System.out.println("O resultado é: \t" + calcularValor.apply(elemento));
    }
}
