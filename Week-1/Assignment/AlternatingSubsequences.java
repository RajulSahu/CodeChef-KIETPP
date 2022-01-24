package com.rajul.Assignment;
import java.util.*;

public class AlternatingSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nums.add(sc.nextInt());
            }
            int ans = maxAlternatingSubSeqSum(nums);
            System.out.println(ans);
            testCases--;
        }
    }
    static int maxAlternatingSubSeqSum(ArrayList<Integer> nums){
        Collections.sort(nums);
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i+=2) {
            if(nums.get(i) > 0) {
                currSum += nums.get(i);
                if(currSum > maxSum) maxSum = currSum;
            }
        }
        currSum = 0;
        for (int i = 1; i < nums.size(); i+=2) {
            if(nums.get(i) > 0) {
                currSum += nums.get(i);
                if(currSum > maxSum) maxSum = currSum;
            }
        }
        return maxSum;
    }
}
