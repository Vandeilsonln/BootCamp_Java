package InterfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args){
        Function<String, String> retornaNomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeContrario.apply("Vandeilson"));
        Function<String, Integer> converteStringParaInteiroECalculaDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(converteStringParaInteiroECalculaDobro.apply("20"));
    }
}
