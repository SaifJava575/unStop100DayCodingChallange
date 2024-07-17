
package com.unstop.day02;
import java.util.Scanner;

public class QueenMats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            System.out.println(maxModuloValue(l, r));
        }

        scanner.close();
    }

    public static int maxModuloValue(int l, int r) {
        if (l <= r / 2) {
            return r - (r / 2 + 1);
        } else {
            return r - l;
        }
    }
}
