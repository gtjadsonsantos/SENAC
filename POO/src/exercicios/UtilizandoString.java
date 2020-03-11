package src.exercicios;

public class UtilizandoString {
    public static void main(String[] args) {
        String disciplina = new String();
        disciplina = "Programação Orientada a Objeto";

        String curso = new String("Análise e Desenvolvimento de Sistemas");

        String aula = "Aula Sobre Strings";

        String assunto = null;

        System.out.println(disciplina);
        System.out.println(curso);
        System.out.println(aula);
        System.out.println(assunto);

        System.out.println("O tamanho da String disciplina é:" + disciplina.length());

        if(disciplina.length() > 10){
            System.out.println("Essa é uma string longa.");
        }else {
            System.out.println("Essa é uma string curta.");
        }


        char[] letras = new char[11];

        disciplina.getChars(0,11,letras,0);

        for(int i = 0; i< letras.length; i++){
            System.out.println("O caracter da posição " + i + " é: " + letras[i]);
        }
    
        String nome = new String("Duke");
        String sobrenome = new String("Duke");

        if(nome == sobrenome){
            System.out.println("São nome iguais");
        }else {
            System.out.println("São nomes diferentes");
        }

        if(nome.equals(sobrenome)){
            System.out.println("São nome iguais");
        }else {
            System.out.println("São nomes diferentes");
        }

    }
}