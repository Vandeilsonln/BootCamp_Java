package javaComparators;
import java.util.Comparator;

public class ExemploComparator implements Comparator<ExemploComparable> {

    @Override
    public int compare(ExemploComparable o1, ExemploComparable o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
