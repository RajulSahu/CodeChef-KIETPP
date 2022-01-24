package com.rajul.Assignment;
import java.util.*;


public class SimpleDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nums.add(sc.nextInt());
            }
            int ans = findNumbers(nums, X, Y);
            System.out.println(ans);
            testCases--;
        }
    }
    static int findNumbers(ArrayList<Integer> nums, int x, int y) {
        int count = 0;
        for(int num: nums){
            if(num <= x && num % y == 0) count++;
        }
        return count;
    }
}
