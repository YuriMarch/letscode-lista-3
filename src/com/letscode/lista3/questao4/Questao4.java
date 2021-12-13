package com.letscode.lista3.questao4;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
public class Questao4 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    final int LIST_LENGTH = 5;
    int[] numberList = new int[LIST_LENGTH];
    float sum = 0;

    for (int i = 0; i < numberList.length; i++) {
      System.out.println("Enter an integer number: ");
      numberList[i] = scanner.nextInt();
      sum += numberList[i];
    }

    float average = sum / LIST_LENGTH;
    int maxNumber = Arrays.stream(numberList).max().getAsInt();
    int minNumber = Arrays.stream(numberList).min().getAsInt();

    System.out.printf("Average: %.2f %n", average);
    System.out.printf("Maximum number: %s %n", maxNumber);
    System.out.printf("Minimum number: %s %n", minNumber);
  }
}
