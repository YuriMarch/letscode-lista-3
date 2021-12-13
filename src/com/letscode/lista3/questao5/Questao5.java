package com.letscode.lista3.questao5;

import com.letscode.lista3.questao7.Person;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o nome mais longo presente na lista.
public class Questao5 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    final int LIST_LENGTH = 5;
    char[][] guestList = new char[LIST_LENGTH][];
    int[] longestNames = new int[LIST_LENGTH];

    for (int i = 0; i < guestList.length; i++){
      System.out.println("Enter the guest name: ");
      guestList[i] = scanner.nextLine().toCharArray();
    }
//
    printYLongestName(returnLongestName(guestList));
  }

  public static char[] returnLongestName(char[][] guestList){
    char[] longestName = guestList[0];

    for (char[] chars : guestList){
      if (chars.length > longestName.length){
        longestName = chars;
      }
    }
    return longestName;
  }

  public static void printYLongestName(char[] longestName){
    String name = "";
    for(char letter : longestName){
      name += letter;
    }
    System.out.printf("The longest name in the list is %s. It has %s characters.", name, longestName.length);
  }
}

