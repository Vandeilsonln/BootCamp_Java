package Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(8.5);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(3.8);

        System.out.println(notasAlunos);

        notasAlunos.remove(3.8);

        System.out.println(notasAlunos.size());

        Iterator<Double> myIterator = notasAlunos.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
