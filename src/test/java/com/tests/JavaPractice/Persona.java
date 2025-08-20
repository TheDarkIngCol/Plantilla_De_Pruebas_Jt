package com.tests.JavaPractice;

import java.util.Scanner;

public class Persona {

  String nombre;
  int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void saludar() {
    System.out.println("Hola, mi nombre es: " + nombre + ", y mi edad es: " + edad);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese su edad");
    int edad = scanner.nextInt();

    Persona persona1 = new Persona(nombre, edad);
    persona1.saludar();
  }
}

