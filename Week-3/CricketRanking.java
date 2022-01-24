package com.rajul;

import java.util.Scanner;

public class CricketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while(testCases > 0) {
            String[] A = sc.nextLine().trim().split(" ");
            String[] B = sc.nextLine().trim().split(" ");
            String winner = whoIsTheBestPlayer(A,B);
            System.out.println(winner);
            testCases--;
        }
    }
    static String whoIsTheBestPlayer(String[] a, String[] b) {
        int A = 0, B = 0;
        for (int i = 0; i < 3; i++) {
            if(Integer.parseInt(a[i]) > Integer.parseInt(b[i])){
                A++;
            }
            else{
                B++;
            }
        }
        return A > B?"A":"B";
    }
}
