package com.rajul;

import java.util.*;

public class AverageFlex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int N = sc.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            int ans = willBoast(nums);
            System.out.println(ans);
            testCases--;
        }
    }
    static int willBoast(int[] nums) {
        int[] freq = new int[101];
        for(int num: nums){
            freq[num]++;
        }
        int result = 0, cnt = 0;
        for (int i = 0; i <= 100; i++) {
            if(freq[i] != 0){
                cnt += freq[i];
                if(cnt > (nums.length - cnt)){
                    result += freq[i];
                }
            }
        }
        return result;
    }
}
