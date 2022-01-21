package com.rajul.Assignment;
import java.util.*;

public class JoyGivingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long n = sc.nextLong();
            boolean ans = isHarshad(n);
            System.out.println(ans ? "YES" : "NO");
        }
    }
    static boolean isHarshad(long n){
        long temp = n;
        int K = 0;
        while(n!=0){
            K += n % 10;
            n = n / 10;
        }
        return temp % K == 0;
    }
}
