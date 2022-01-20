package com.rajul;

import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Xr = sc.nextInt();
            int Yr = sc.nextInt();
            int D = sc.nextInt();
            boolean ans = canSurvive(X, Y, Xr, Yr, D);
            System.out.println(ans ? "YES" : "NO");
        }
    }
        static boolean canSurvive(int X, int Y, int Xr, int Yr, int D){
        return (X >= D*Xr && Y >= D*Yr);
        }
}
