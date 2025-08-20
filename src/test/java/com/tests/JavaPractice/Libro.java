package com.tests.JavaPractice;

import java.util.Scanner;

public class Libro {

  String titulo;
  String autor;
  int paginas;

  public Libro(String titulo, String autor, int paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
  }

  public void mostrarInfo() {
    System.out.println("El titulo del libro es: " + titulo);
    System.out.println("El autor del libro es: " + autor);
    System.out.println("Las paginas del libro son: " + paginas);
  }

  public void esLargo() {
    if (paginas >= 300) {
      System.out.print("¿Es un libro largo?: Si");
    } else {
      System.out.print("¿Es un libro largo?: No");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el titulo del libro");
    String titulo = scanner.nextLine();
    System.out.println("Ingrese el autor del libro");
    String autor = scanner.nextLine();
    System.out.println("Ingrese el número de paginas del libro");
    int paginas = scanner.nextInt();

    Libro infLibro = new Libro(titulo, autor, paginas);
    infLibro.mostrarInfo();
    infLibro.esLargo();
  }
  
}
