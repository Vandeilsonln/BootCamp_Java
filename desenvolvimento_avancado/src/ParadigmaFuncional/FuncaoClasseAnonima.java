package ParadigmaFuncional;

public class FuncaoClasseAnonima {
    public static void main(String[] args){
        Funcao colocaPrefixoString = new Funcao() {
            @Override
            public String gerar(String valor) {return "Sr. " + valor;}
        };
        System.out.println(colocaPrefixoString.gerar("Danilo"));
    }
}
