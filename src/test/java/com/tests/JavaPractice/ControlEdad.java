  package com.tests.JavaPractice;

  import java.util.Scanner;

  public class ControlEdad {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        scanner.close();
    }
  }