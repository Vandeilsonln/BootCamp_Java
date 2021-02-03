package UtilDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args){
        Long currentTimeMilis = System.currentTimeMillis();
        // retorna um número que representa o momento atual - em milissegundos
        System.out.println(currentTimeMilis);

        Date novaData = new Date(currentTimeMilis);
        // gera data com base nos milissegundos
        System.out.println(novaData);
    }
}
