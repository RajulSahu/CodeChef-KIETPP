package com.rajul;

import java.util.Arrays;
import java.util.Scanner;

public class CollegeLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){

            long totalTime = 0;
            int totalSeasons = sc.nextInt();

            int[] Q = new int[totalSeasons];
            for (int i = 0; i < totalSeasons; i++) {
                Q[i] = sc.nextInt();
            }

            for (int i = 0; i < totalSeasons; i++) {
                int ep = sc.nextInt();
                int dur;
                for (int j = 0; j < ep; j++) {
                    dur = sc.nextInt();
                    if(j == 0) totalTime += dur;
                    else totalTime += dur - Q[i];
                }
            }
            System.out.println(totalTime);
            testCases--;
        }
    }
}
