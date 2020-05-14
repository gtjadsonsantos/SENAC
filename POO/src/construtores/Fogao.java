package src.construtores;

import src.construtores.Eletrodomestico;


public class Fogao extends Eletrodomestico {
  

  Fogao(String model, String producer, double capacity, double hours, double potency) {
    this.model = model;
    this.producer = producer;
    this.capacity = capacity;
    this.hours = hours;
    this.potency = potency;
  }

  Fogao() {
  };

  @Override
  protected double calculaKW() {
    return ( this.potency / 1000 ) * this.hours;
  }
  
  @Override
  protected double calculaDIA(double days) {
    return calculaKW() *  days;
  }

}