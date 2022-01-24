package com.rajul;

import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int X = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(findDays(X,M,D));
            testCases--;
        }
    }
    static int findDays(int x, int m, int d) {
        return Math.min((x*m), (x+d));
    }
}
