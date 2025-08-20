package com.tests.JavaPractice;

import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese los nombres");
    String[] nombres = new String[5];

    for(int i = 0; i < nombres.length; i++) {
      System.out.print("Nombre " + (i + 1) + ": ");
      nombres[i] = scanner.nextLine();
    }

    System.out.println("\n Lista de nombres");
    int contadorVocales = 0;
    for(String nombre : nombres) {
      char primeraLetra = nombre.toLowerCase().charAt(0);
      if (primeraLetra == 'a' || primeraLetra == 'e' ||
          primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u') {
            contadorVocales++;
          }
      System.out.println("- " + nombre);
    }
    System.out.println("\nTotal de nombres que comienzan con vocal: " + contadorVocales);
  }
}
