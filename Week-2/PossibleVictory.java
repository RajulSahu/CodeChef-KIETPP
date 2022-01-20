package com.rajul;

import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int O = sc.nextInt();
        int C = sc.nextInt();
        boolean ans = canWin(R, O, C);
        System.out.println(ans?"YES":"NO");
    }
    static boolean canWin(int R, int O, int C){
        int canScoreMaxRuns = (20-O)*6*6;
        int maxRuns = C + canScoreMaxRuns;
        return maxRuns > R;
    }
}
