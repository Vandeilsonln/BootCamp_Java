package ParadigmaFuncional;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificaMaior =
                (parametro1, parametro2) -> parametro1 > parametro2;

        System.out.println(verificaMaior.test(13, 12));
        System.out.println(verificaMaior.test(13, 12));
    }
}
