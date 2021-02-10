package ParadigmaFuncional;

public class Recursividade {
    public static void main(String[] args){
        System.out.println(fatorial(10));
    }

    public static int fatorial(int numero){
        if (numero == 1) return numero;
        else{
            return numero * fatorial(numero -1);
        }
    }
}
