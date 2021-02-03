package UtilDate;
import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args){
        Date dataPassado = new Date(1423784659012L);
        Date dataFuturo = new Date(1789784659012L);
        Date mesmaDataFuturo = new Date(1789784659012L);

        boolean isEqual = dataFuturo.equals(mesmaDataFuturo);

        int compareCase1 = dataPassado.compareTo(dataFuturo);
        int compareCase2 = dataFuturo.compareTo(dataPassado);
        int compareCase3 = dataFuturo.compareTo(mesmaDataFuturo);

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);

    }
}
