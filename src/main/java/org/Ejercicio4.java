package org;


import java.util.Scanner;

public class Ejercicio4 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }
    public static int askNumber () {
        System.out.println("introduce un numero");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        return n1;
    }

    public static int sum (int n1, int n2) {
        return n1 + n2;
    }

    public static int rest (int n1, int n2) {
        return n1 - n2;
    }

    public static void sum () {
        int n1 = askNumber();
        int n2 = askNumber();

        int result = sum(n1 , n2);
        System.out.println("el resultado es " + result);
    }

    public static void rest () {
        int n1 = askNumber();
        int n2 = askNumber();

        int result = rest(n1 , n2);
        System.out.println("el resultado es " + result);
    }

    public static int multiply (int n1, int n2) {
        return n1 * n2;
    }

    public static void multiply () {
        int n1 = askNumber();
        int n2 = askNumber();

        int result = multiply(n1, n2);
        System.out.println("el resultado es " + result);
    }

    public static void menu () {
        int option;

        do {
            System.out.println("elige una de estas opciones");
            System.out.println("1. Suma los numeros");
            System.out.println("2. Restas los numeros");
            System.out.println("3 multiplica los numeros");
            System.out.println("4. Salir");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option ==1) {
                sum();
            } else if (option == 2) {
                rest();
            } else if (option == 3) {
                multiply();
            } else if (option == 4) {
                System.out.println("saliendo...");
            } else {
                System.out.println("operacion invalida");
            }
        }while(option != 4);
    }

}
