package com.letscode.lista3.questao3;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
public class Questao3 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    final int LIST_LENGTH = 5;
    int[] numberList = new int[LIST_LENGTH];

    for (int i = 0; i < numberList.length; i++){
      System.out.println("Enter an integer number: ");
      numberList[i] = scanner.nextInt();
    }

    for (int i = 0; i < numberList.length; i++){
      if(numberList[i] % 2 != 0){
        System.out.println(numberList[i]);
      }
    }

    for (int i = 0; i < numberList.length; i++){
      if(numberList[i] % 2 == 0){
        System.out.println(numberList[i]);
      }
    }
  }
}
