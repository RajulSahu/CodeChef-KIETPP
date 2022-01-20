package com.rajul;
import java.util.*;

public class ChefAndCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int D = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            String[] A = sc.nextLine().split(" ");
            String[] B = sc.nextLine().split(" ");
            boolean ans = shouldBuyCoupon(A, B, C, D);
            System.out.println(ans?"YES":"NO");
        }
    }
    static boolean shouldBuyCoupon(String[] A, String[] B, int C, int D){
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 3; i++) {
            sumA += Integer.parseInt(A[i]);
            sumB += Integer.parseInt(B[i]);
        }
        int costWithoutCoupon = sumA + sumB + 2*D;
        int tempAmt = costWithoutCoupon;
        boolean couponBuyed = false;
        if(sumA >= 150){
            tempAmt -= D;
            tempAmt += C;
            couponBuyed = true;
        }
        if(sumB >= 150){
            tempAmt -= D;
            if(!couponBuyed) tempAmt += C;
        }
        return tempAmt < costWithoutCoupon;
    }
}
