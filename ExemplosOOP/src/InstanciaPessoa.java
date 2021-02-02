public class InstanciaPessoa {

    public static void main(String[] args){

        Pessoa pessoinha = new Pessoa("Vandeilson");

        System.out.println(pessoinha.getNome());

        pessoinha.setNome(("Lima Nobre"));

        System.out.println((pessoinha.getNome()));

    }
}
