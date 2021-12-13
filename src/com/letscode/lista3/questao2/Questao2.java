package com.letscode.lista3.questao2;


import java.util.Scanner;

//Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
public class Questao2 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    System.out.println("Enter a word: ");
    String word = scanner.nextLine();
    String invertedWord = "";
    char character;

    for (int i = 0; i < word.length(); i++){
      character = word.charAt(i);
      invertedWord = character + invertedWord;
    }

    System.out.printf("Word: %s %n", word);
    System.out.printf("Inverted word: %s %n", invertedWord);
  }
}
