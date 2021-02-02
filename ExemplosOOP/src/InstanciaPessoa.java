public class InstanciaPessoa {

    public static void main(String[] args){

        Pessoa pessoinha = new Pessoa("Vandeilson",29, 8, 1995);

        System.out.println(pessoinha.getNome());
        System.out.println(pessoinha.getDataNascimento());
        System.out.println(pessoinha.calculaIdade());

        pessoinha.setNome("Van Der Wilson");
        System.out.println(pessoinha.getNome());

    }
}
