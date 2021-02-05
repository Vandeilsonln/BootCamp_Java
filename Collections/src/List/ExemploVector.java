package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args){
        List<String> esportes = new Vector<>();

        // add 4 elementos
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Vôlei");
        esportes.add("Handebol");

        // Altera o valor da pos 2
        esportes.set(2, "Ping Pong");

        esportes.remove(2);

        esportes.remove("Handebol");

        System.out.println(esportes.get(0));

        // traverse
        for (String i : esportes){
            System.out.println(i);
        }

    }
}
