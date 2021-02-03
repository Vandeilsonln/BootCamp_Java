package UtilCalendar;
import java.util.Calendar;

public class Exemplo001 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());

    }
}
