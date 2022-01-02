package com.rajul;
import java.util.*;

public class NobelPrice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            boolean[] arr = new boolean[M+1];
            arr[0] = true;
            for (int i = 1; i <= N; i++) {
                arr[sc.nextInt()] = true;
            }
            boolean ans = false;
            for (boolean isTaken: arr){
                if(!isTaken) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans?"Yes":"No");
            testCases--;
        }
    }
}
