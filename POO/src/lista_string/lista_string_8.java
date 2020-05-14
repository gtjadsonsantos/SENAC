package src.lista_string;

import java.util.Scanner;

public class lista_string_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        String outMonth = "";

        System.out.println("Informe o dia de nascimento");
        day = keyboard.nextInt();

        System.out.println("Informe o mês de nascimento");
        month = keyboard.nextInt();

        System.out.println("Informe o ano de nascimento");
        year = keyboard.nextInt();

        switch (month) {
            case 1:
                outMonth = "JANEIRO";
                break;
            case 2:
                outMonth = "FEVEREIRO";
                break;
            case 3:
                outMonth = "MARÇO";
                break;
            case 4:
                outMonth = "ABRIL";
                break;
            case 5:
                outMonth = "MAIO";
                break;
            case 6:
                outMonth = "JUNHO";
                break;
            case 7:
                outMonth = "JULHO";
                break;
            case 8:
                outMonth = "AGOSTO";
                break;
            case 9:
                outMonth = "SETEMBRO";
                break;
            case 10:
                outMonth = "OUTUBRO";
                break;
            case 11:
                outMonth = "NOVEMBRO";
                break;
            case 12:
                outMonth = "DEZEMBRO";
                break;
            default:
                break;
        }

        System.out.println("VOCÊ NASCEU EM " + day + " DE " + outMonth + " DE " + year);
    }
}