package src.construtores;

import src.construtores.Geladeira;
import src.construtores.Fogao;
import src.construtores.LavaLouca;
import src.construtores.MicroOndas;

public class Cozinha {
  public static void main(String[] args) {
    Geladeira geladeira = new Geladeira("G", "Continental", 5, 720, 500);
    Fogao fogao = new Fogao("G", "Continental", 5, 720, 500);
    LavaLouca lavaLouca = new LavaLouca("G", "Continental", 5, 720, 500);
    MicroOndas microOndas = new MicroOndas("G", "Continental", 5, 720, 500);

    System.out.println("O consumo no mês é de: ");
    System.out.println(
        geladeira.calculaDIA(30) + fogao.calculaDIA(30) + lavaLouca.calculaDIA(30) + microOndas.calculaDIA(30) + " KW"

    );

    System.out.println("O consumo por 10 dias é de: ");
    System.out.println(
        geladeira.calculaDIA(10) + fogao.calculaDIA(10) + lavaLouca.calculaDIA(10) + microOndas.calculaDIA(10) + " KW"

    );

  }
}