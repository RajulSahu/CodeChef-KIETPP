package com.rajul;
import java.util.*;


public class NobelPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }
            boolean ans = willWinNobelBoolArray(nums, N, M);
            System.out.println(ans?"Yes":"No");
            testCases--;
        }
    }

    // Using HashMaps
    static boolean willWinNobel(int[] nums, int researchers, int topics){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 1; i <= topics; i++) {
            map.put(i, 0);
        }
        for(int num: nums){
            if(map.containsKey(num))
                map.put(num, map.get(num)+1);
        }
        for(Map.Entry<Integer ,Integer> entry: map.entrySet()){
            if(entry.getValue() == 0)
                return true;
        }
        return false;
    }

    // Using Insertion sort technique
    static boolean willWinNobelInsertionSort(int[] nums, int researchers, int topics){
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                return true;
            }
        }
        return false;
    }
    static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
    }

    // Using Boolean Array
    static boolean willWinNobelBoolArray(int[] nums, int researchers, int topics){
        boolean[] arr = new boolean[topics+1];
        arr[0] = true;
        for(int num: nums){
            arr[num] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(!arr[i])
                return true;
        }
        return false;
    }
}
