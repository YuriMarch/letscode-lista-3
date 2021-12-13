package com.letscode.lista3.questao8;

public class Person {
  public String name;
  public double height;
  public double weight;

  public Person(String name, double height, double weight){
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public double calculateIMC(double weight, double height){
    double imc = this.weight / Math.pow(this.height, 2);
    return imc;
  }
}
