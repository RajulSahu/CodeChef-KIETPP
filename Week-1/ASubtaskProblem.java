package com.rajul;
import java.util.*;

public class ASubtaskProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            int score = calcScore(nums, N, M, K);
            System.out.println(score);
            testCases--;
        }
    }
    static int calcScore(int[] nums, int n, int m, int k){
        int score = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(i == m-1 && sum == m) score = k;
            if(i == n-1 && sum == n) score = 100;
        }
        return score;
    }
}