package utilQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args){
        Queue<String>filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

//        filaBanco.clear();
//        String novoCliente = filaBanco.element();
//        System.out.println(novoCliente);

        for (String element: filaBanco){
            System.out.println(element);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println("\t " + iteratorFilaBanco.next());
        }

    }
}
