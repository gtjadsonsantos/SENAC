package src.construtores;

public abstract class Eletrodomestico {

  protected String model;
  protected String producer;
  protected double capacity;

  protected double potency;
  protected double hours;

  protected void setModel(String model) {
    this.model = model;
  }

  protected void setProducer(String producer) {
    this.producer = producer;
  }

  protected void setcapacity(double capacity) {
    this.capacity = capacity;
  }

  protected void setPotency(double potency) {
    this.potency = potency;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  protected double getCapacity() {
    return capacity;
  }

  protected String getModel() {
    return model;
  }

  protected String getProducer() {
    return producer;
  }

  protected abstract double calculaKW();
  protected abstract double calculaDIA(double days);

}