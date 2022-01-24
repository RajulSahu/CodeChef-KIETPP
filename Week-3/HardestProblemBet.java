package com.rajul;
import java.util.*;

public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            String winner = whoWins(A,B,C);
            System.out.println(winner);
            testCases--;
        }
    }
    static String whoWins(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        if(min == a) return "Draw";
        if(min == b) return "Bob";
        else return "Alice";
    }
}
