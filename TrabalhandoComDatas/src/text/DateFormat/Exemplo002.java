package text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args){
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
