package Java8Plus;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Exemplo001 {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        System.out.println(ontem);

        //-----------------------------------------

        LocalTime agora = LocalTime.now();
        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
        System.out.println(agora);

        //-----------------------------------------

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        LocalDateTime futuro = now.plusHours(1).plusDays(3).plusSeconds(25).plusYears(5);
        System.out.println(futuro);
    }
}
