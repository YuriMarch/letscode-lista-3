package com.letscode.lista3.questao1;

import java.util.Arrays;
import java.util.Scanner;

//Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras.
// Ao final da entrada dos 5 itens, exiba a lista completa.

public class Questao1 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    final int MAX_ITEMS = 5;
    String[] fruitList = new String[MAX_ITEMS];

    for (int i = 0; i < fruitList.length; i++){
      System.out.println("Enter a fruit: ");
      fruitList[i] = scanner.nextLine();
    }

    System.out.println(Arrays.toString(fruitList));
  }
}
