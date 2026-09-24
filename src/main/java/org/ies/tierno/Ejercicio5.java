package org.ies.tierno;

import java.util.Scanner;

public class Ejercicio5 {
    public static Scanner scanner = new Scanner(System.in);

    public static int sumatorio (int n1) {
         int sumatorio = 0;

        for (int i = 0; i <= n1; i++) {

         sumatorio = sumatorio + i;
        }
        return sumatorio;
    }
}
