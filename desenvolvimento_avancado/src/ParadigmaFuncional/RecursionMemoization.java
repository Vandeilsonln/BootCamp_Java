package ParadigmaFuncional;

import java.util.HashMap;
import java.util.Map;

public class RecursionMemoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args){
        long I = System.nanoTime();
        System.out.println(factorialMemoization(50));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 - " + (F-I));

        I = System.nanoTime();
        System.out.println(factorialMemoization(50));
        F = System.nanoTime();
        System.out.println("Fatorial 1 - " + (F-I));

    }

    public static Integer factorialMemoization(Integer value){
        if(value == 1) return value;
        else{
            if(MAPA_FATORIAL.containsKey(value)){
                return  MAPA_FATORIAL.get(value);
            }
            else{
                Integer resultado = value + factorialMemoization(value - 1);
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }
}
