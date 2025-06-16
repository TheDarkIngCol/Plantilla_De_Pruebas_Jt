package com.tests.JavaPractice;

import java.util.Scanner;

public class Menu {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una opcion");
    int opcion = scanner.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Ver perfil");
        break;
      case 2:
        System.out.println("Configuración");
        break;
      case 3:
        System.out.println("Salir");
        break;
      default:
        System.out.println("Opcion no valida");
        break;
    }
    scanner.close();
  }
}
