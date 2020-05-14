package src.lista_array;

//CRIE UM ARRAY DE INTEIROS DETAMANHO 10.IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,BEM COMO A MÉDIA ARITMÉTICA DOSELEMENTOS ARMAZENADOS NESTE ARRAY QUE SÃO ÍMPARES

public class Array_three {

    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        int average = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = 10;
        } 

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        average = sum / array.length;

        System.out.println("Média aritmetica é: " + average);

        
        
        

    }
}