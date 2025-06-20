package com.tests.JavaPractice;

import java.util.Scanner;

public class Aplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seleccione una opción:");
    System.out.println("1. Saludar");
    System.out.println("2. Contar hasta un número");
    System.out.println("3. Clasificar edad");
    System.out.println("4. Salir");

    int opcion = scanner.nextInt();
    scanner.nextLine(); 

    switch (opcion) {
      case 1:
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        break;
      case 2:
        System.out.println("Digite un numero:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numero; i++) {
          System.out.println(i);
        }
        break;
      case 3:
      System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        if(edad < 18 ) {
          System.out.println("Menor de edad");
        }
        else if (edad >= 18 && edad <= 64) {
          System.out.println("Adulto");
        }
        else if (edad >= 65) {
          System.out.println("Adulto mayor");
        }
        else{
          System.out.println("edad no valida");
        }
        break;
      case 4:
        System.out.println("Saliendo del programa");
        break;
      default:
        System.out.println("Opción no válida");
        break;
    }
    scanner.close();
  }
}
