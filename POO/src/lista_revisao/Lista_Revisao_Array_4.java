package src.lista_revisao;

import java.util.Scanner;

public class Lista_Revisao_Array_4 {
    public static void main(String[] args) {
        String[] name = new String[10];
        int[] age = new int[10];
        Scanner keyboard = new Scanner(System.in);
        int minAge = 0;
        String minName = "" ;
        int maxAge = 0;
        String maxName = "";
        int sum = 0;
        int average = 0;

        for(int i = 0;i < name.length; i++){
            System.out.println("Informe o nome da " + i + " pessoa: ");
            name[i] = keyboard.next();

            System.out.println("Informe a idade da " + i + " pessoa: ");
            age[i] =  Integer.parseInt(keyboard.next());
            sum = sum + age[i];
            maxName = name[i];
            minName = name[i];
            minAge = age[i];
            maxAge = age[i];
        }
        for(int i = 0;i < name.length; i++){

            if(age[i] < minAge){
                minAge = age[i];
                minName = name[i];  
            }

            if(age[i] > maxAge){
                maxAge = age[i];
                maxName = name[i];
            }

        }

        average = sum / age.length;

        System.out.println("Menor: "  + minName + " " + minAge);
        System.out.println("Maior: "  + maxName + " " + maxAge);
        System.out.println("Média: " + average);


    }
}