package Sets;
import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args){
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");

        System.out.println(treeCapitais);

        for(String i: treeCapitais){
            System.out.println(i);
        }

        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());
        System.out.println(treeCapitais.lower("Florianópolis"));
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> myIterator = treeCapitais.iterator();

        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

    }
}
