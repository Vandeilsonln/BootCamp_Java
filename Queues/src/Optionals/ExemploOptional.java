package Optionals;
import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args){

        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("\nValor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("\nValor opcional que não está presente - empty");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty - não está presente"));

    }
}
