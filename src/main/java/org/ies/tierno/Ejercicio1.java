package org.ies.tierno;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el primer numero");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("introduce el segundo numero");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        int result = calcularsuma(n1, n2);

        printResul(result);
    }

    public static int calcularsuma(int n1, int n2) {
        return n1 + n2;
    }
    public static void printResul (int result) {
        System.out.println("el resultado es " + result);
    }
}
