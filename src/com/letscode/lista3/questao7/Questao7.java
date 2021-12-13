package com.letscode.lista3.questao7;

import java.util.Scanner;

//Escreva um programa que lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais velho e qual a média de idade.
public class Questao7 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    final int LIST_LENGTH = 5;
    Person[] people = new Person[LIST_LENGTH];
    System.out.println("Enter the personal details: ");
    for (int i = 0; i < people.length; i++){
      System.out.printf("%d. %n", i+1);
      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Age: ");
      int age = scanner.nextInt();
      scanner.nextLine();

      people[i] = new Person(name, age);
    }
    printYoungestPerson(returnYoungestPerson(people));
    printOldestPerson(returnOldestPerson(people));
    printAverageAge(people);
  }

  public static Person returnYoungestPerson(Person[] people){
    Person youngestPerson = people[0];

    for(Person person : people){
      if (person.age < youngestPerson.age){
        youngestPerson = person;
      }
    }
    return youngestPerson;
  }

  public static void printYoungestPerson(Person youngestPerson){
    System.out.printf("The youngest person in the group is %s and he/she is %s years old. %n", youngestPerson.name, youngestPerson.age);
  }

  public static Person returnOldestPerson(Person[] people){
    Person oldestPerson = people[0];

    for(Person person : people){
      if (person.age > oldestPerson.age){
        oldestPerson = person;
      }
    }
    return oldestPerson;
  }

  public static void printOldestPerson(Person oldestPerson){
    System.out.printf("The oldest person in the group is %s and he/she is %s years old. %n", oldestPerson.name,oldestPerson.age);
  }

  public static float calculateAverageAge(Person[] people){
    float sumAges = 0;

    for (Person person : people){
      sumAges += person.age;
    }
    return sumAges / people.length;
  }

  public static void printAverageAge(Person[] people){
    System.out.printf("The average age in the group is %.1f years. %n", calculateAverageAge(people));
  }
}
