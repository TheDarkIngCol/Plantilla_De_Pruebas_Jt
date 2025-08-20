package com.tests;

import java.util.Scanner;


public class Estudiante {

  String nombre;
  float[] notas = new float[3];

  public Estudiante(String nombre, float[] notas) {
    this.nombre = nombre;
    this.notas = notas;
  }

  public float calcularPromedioPonderado() {
    return (notas[0] * 0.20f) + (notas[1] * 0.30f) + (notas[2] * 0.50f);
  }

  public boolean estaAprobado() {
    return calcularPromedioPonderado() >= 3.0;
  }

  public void mostrarInfo() {
    System.out.println("Estudiante: " + nombre);
    System.out.print("Notas: ");
    for (float n : notas) {
      System.out.print(n + " ");
    }
    float promedio = calcularPromedioPonderado();
    System.out.printf("\nPromedio: %.2f\n", promedio);
    System.out.println("Estado: " + (estaAprobado() ? "Aprobado" : "Reprobado"));
    System.out.println("--------------------------");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("¿Cuántos estudiantes desea registrar? ");
    int cantidad = scanner.nextInt();
    scanner.nextLine(); // limpiar buffer

    Estudiante[] estudiantes = new Estudiante[cantidad];

    for (int i = 0; i < cantidad; i++) {
      System.out.println("\nEstudiante #" + (i + 1));
      System.out.print("Nombre: ");
      String nombre = scanner.nextLine();

      float[] notas = new float[3];
      for (int j = 0; j < 3; j++) {
        System.out.print("Nota " + (j + 1) + ": ");
        notas[j] = scanner.nextFloat();
      }
      scanner.nextLine(); // limpiar buffer
      estudiantes[i] = new Estudiante(nombre, notas);
    }

    int aprobados = 0;
    int reprobados = 0;
    Estudiante mejorEstudiante = estudiantes[0];

    System.out.println("\n=== RESULTADOS ===");

    for (Estudiante e : estudiantes) {
      e.mostrarInfo();
      if (e.estaAprobado()) {
        aprobados++;
      } else {
        reprobados++;
      }

      if (e.calcularPromedioPonderado() > mejorEstudiante.calcularPromedioPonderado()) {
        mejorEstudiante = e;
      }
    }

    System.out.println("Aprobados: " + aprobados);
    System.out.println("Reprobados: " + reprobados);
    System.out.printf("Estudiante con mejor promedio: %s (%.2f)\n",
        mejorEstudiante.nombre,
        mejorEstudiante.calcularPromedioPonderado());
  }
}
