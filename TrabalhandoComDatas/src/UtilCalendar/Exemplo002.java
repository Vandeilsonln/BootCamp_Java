package UtilCalendar;
import java.util.Calendar;

public class Exemplo002 {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        System.out.printf("%tc\n", agora);  // qua. fev. 03 14:56:33 BRT 2021

        System.out.printf("%tF\n", agora);  // 2021-02-03

        System.out.printf("%tD\n", agora);  // 02/03/21

        System.out.printf("%tr\n", agora);  // 02:57:34 PM

        System.out.printf("%tT\n", agora);  // 14:57:34
    }
}
