package UtilDate;
import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args){
        Date dataPassado = new Date(1423784659012L);
        Date dataFuturo = new Date(1789784659012L);

        boolean isAfter = dataPassado.after(dataFuturo);
        System.out.println("É no futuro: " + isAfter);

        boolean isBefore = dataPassado.before(dataFuturo);
        System.out.println("É no passado: " + isBefore);
    }
}
