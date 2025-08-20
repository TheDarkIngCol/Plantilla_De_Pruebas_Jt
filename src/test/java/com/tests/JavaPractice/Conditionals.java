package com.tests.JavaPractice;

import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese su edad");

    int edad = scanner.nextInt();
    scanner.nextLine();

    if(edad >= 18) {
      System.out.println("Usted tiene edad para votar");
      System.out.println("Y tambien puede conducir");
    }
    else {
      System.out.println("Usted no tiene edad para estar aqui");
    }

  }
  
}
