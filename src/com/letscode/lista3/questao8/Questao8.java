package com.letscode.lista3.questao8;

import java.util.Scanner;

//Escreva um programa que lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
public class Questao8 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    final int LIST_LENGTH = 5;
    Person[] people = new Person[LIST_LENGTH];
    System.out.println("Enter the personal details: ");
    for (int i = 0; i < people.length; i++) {
      System.out.printf("%d. %n", i + 1);
      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Height (m): ");
      double height = scanner.nextDouble();

      System.out.print("Weight (kg): ");
      double weight = scanner.nextDouble();
      scanner.nextLine();

      people[i] = new Person(name, height, weight);

      if (people[i].calculateIMC(weight, height) > 25 ){
        System.out.printf("%s esta com sobrepeso. Seu IMC e de: %.2f  %n", people[i].name, people[i].calculateIMC(people[i].weight, people[i].height));
      } else if (people[i].calculateIMC(weight, height) < 18.5){
        System.out.printf("%s esta abaixo do peso ideal. Seu IMC e de: %.2f %n", people[i].name, people[i].calculateIMC(people[i].weight, people[i].height));
      } else {
        System.out.printf("%s esta com o peso ideal. Seu IMC e de: %.2f %n", people[i].name, people[i].calculateIMC(people[i].weight, people[i].height));
      }
    }
  }
}
