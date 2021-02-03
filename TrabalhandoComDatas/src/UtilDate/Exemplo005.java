package UtilDate;
import java.util.Date;
import java.time.Instant;

public class Exemplo005 {
    public static void main(String[] args){
        Date dataInicio = new Date(1526485968348L);
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
    }
}
