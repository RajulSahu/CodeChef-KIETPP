package com.rajul;
import java.util.*;


public class MakeThemEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int elements = sc.nextInt();
            int[] nums = new int[elements];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            makeThemEqual(nums);
            testCases--;
        }
    }
    static void makeThemEqual(int[] nums){
        int max = calcMax(nums);
        int ans = 0;
        for(int num: nums){
            ans = Math.max(max-num, ans);
        }
        System.out.println(ans);
    }
    static int calcMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
}
