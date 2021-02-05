package Sets;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExemploLinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<Integer> sequencial = new LinkedHashSet<>();

        sequencial.add(1);
        sequencial.add(2);
        sequencial.add(3);
        sequencial.add(4);
        sequencial.add(5);
        sequencial.add(6);
        sequencial.add(7);

        System.out.println(sequencial);

        sequencial.remove(4);

        System.out.println(sequencial.size());

        Iterator<Integer> myIterator = sequencial.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
