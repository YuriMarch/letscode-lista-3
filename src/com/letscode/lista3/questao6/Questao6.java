package com.letscode.lista3.questao6;

import java.util.Scanner;

//Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
public class Questao6 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter a word: ");
    String word = scanner.nextLine();
    String modifiedWord = "";
    char character = 0;

    for (int i = 0; i < word.length(); i++){
      if ( i % 2 == 0) {
        character = java.lang.Character.toUpperCase(word.charAt(i));
        modifiedWord += character;
      } else {
        character = java.lang.Character.toLowerCase(word.charAt(i));
        modifiedWord += character;
      }
    }

    System.out.printf("Word: %s %n", word);
    System.out.printf("Modified word: %s %n", modifiedWord);
  }
}
