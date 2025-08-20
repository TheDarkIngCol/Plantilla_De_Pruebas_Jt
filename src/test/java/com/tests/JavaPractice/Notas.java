package com.tests.JavaPractice;

import java.util.Scanner;

public class Notas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese las notas");
    float[] notas = new float[5];


    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota " + (i + 1) + ": ");
      notas[i] = scanner.nextInt();
    }

    System.out.println("\n Lista de notas");

    for (float nota : notas) {
      System.out.println("- " + nota);
    }

    float promedionotas = ((notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / 5);
    System.out.println("\n El promedio es: " + promedionotas);
    
    if (promedionotas < 0) {
      System.out.print("Nota invalida");
    }
    else if (promedionotas >= 3.0) {
      System.out.print("Aprobaste");
    } else {
      System.out.print("Reprobaste");
    }
  }
}
