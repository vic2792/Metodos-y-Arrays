package org.ies.tierno;

import java.util.Scanner;

import static org.Ejercicio4.askNumber;

public class Ejercicio5 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            option = option();

            if (option == 1) {
                int numero = askNumber();
                int resultado = sumatorio(numero);
                System.out.println("el resultado es " + resultado);
            } else if (option == 2) {
                int numero = askNumber();
                int resultado = factorial(numero);
                System.out.println("El resultado es " + resultado);
            } else if (option == 3) {
                int n1 = askNumber();
                int n2 = askNumber();
                int n3 = askNumber();
                int n4 = askNumber();

                double resultado = media(n1,n2,n3,n4);
                System.out.println("la media es " + resultado);
            } else if (option == 4) {
                System.out.println("saliendo");
            } else {
                System.out.println("opcion invalida");
            }

        } while (option != 4);
    }
    public static int sumatorio (int n1) {
         int sumatorio = 0;

        for (int i = 0; i <= n1; i++) {

         sumatorio = sumatorio + i;
        }
        return sumatorio;
    }

    public static int factorial (int n1) {
        int factorial = 1;

        for (int i = 1; i <= n1; i++) {

            factorial = factorial * i;
        }
        return factorial;
    }

    public static double media (int n1, int n2, int n3, int n4) {
        int result = n1 + n2 + n3 + n4;

        double media = result / 4.0;

        return media;
    }

    public static void menu () {
            System.out.println("Elige una de estas opciones");
            System.out.println("1. Sumatorio");
            System.out.println("2. Factorial");
            System.out.println("3. Media");
            System.out.println("4. Salir");
        }

        public static int option () {
        menu();

        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
        }
    public static int askNumber () {
        System.out.println("introduce un numero");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        return n1;
    }
    }

