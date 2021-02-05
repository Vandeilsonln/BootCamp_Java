package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio001 {
    public static void main(String[] args){

        List<String> myData = new ArrayList<>();

        myData.add("Juliana");
        myData.add("Pedro");
        myData.add("Carlos");
        myData.add("Larissa");
        myData.add("João");

        System.out.println(myData);

        for(String i : myData){
            System.out.println(i);
        }

        myData.set(2, "Roberto");
        System.out.println(myData.get(1));

        myData.remove(4);
        System.out.println(myData);
        System.out.println(myData.size());
        System.out.println(myData.contains("Juliano"));

        List<String> newNames = new ArrayList<>();
        newNames.add("Ismael");
        newNames.add("Rodrigo");

        myData.addAll(newNames);
        System.out.println(myData);

        Collections.sort(myData);
        System.out.println(myData.isEmpty());
        System.out.println(myData);



    }
}
