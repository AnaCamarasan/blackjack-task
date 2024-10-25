package com.lloyds;

import java.util.Scanner;

public class Compare {
    public static int n1, n2;
    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        n1 = scanner.nextInt();

        System.out.println("Enter another positive number:");
        n2 = scanner.nextInt();
    }

    public static int compareNumbers () {
        readUserInput();
        if (n1 > 21 && n2 > 21) {
            return 0;
        } else {
            if (n1 < 21) {
                if (n2 > 21) return n1;
                else {
                    return Math.max(n2, n1);
                }
            } else {
                return n2;
            }
        }
    }

}
