package src.exercicios;

public class EntendendoString {
    public static void main(String[] args) {
        
        String nome1 = new String("Jadson"); 
        String nome2 = new String("Jadson");
        String nome3 = new String("Santos");

        int numero1 = nome1.compareTo(nome2);
        int numero2 = nome1.compareTo(nome3);
        int numero3 = nome3.compareTo(nome1);

        System.out.println(numero1 + " Tamanho iguais.");
        System.out.println(numero2 + " String 1 menor que String 2.");
        System.out.println(numero3 + " String 1 maior que String 2.");

        boolean inicia = nome1.startsWith("Jadso",0);
        boolean finaliza = nome1.endsWith("Jadso");

        System.out.println(inicia);
        System.out.println(finaliza);
        
        int posicao1 = nome1.indexOf("Jads",0);
        int posicao2 = nome1.lastIndexOf("Jads");

        System.out.println(posicao1 + "  " + posicao2);
        
        String palavra = nome1.substring(1);
        System.out.println(palavra);

        String nome = " Casa teste Casa";

        System.out.println(nome.replace("Casa", "Jadson"));
        
        System.out.println(nome.toLowerCase());
        
        System.out.println(nome.toUpperCase());

        System.out.println(nome.concat("Jadsonmmm mmm m m  Jadson"));
       
        System.out.println(nome.trim());

        String[] array = nome.split(" ");

        System.out.println(array[0]);
    }
}