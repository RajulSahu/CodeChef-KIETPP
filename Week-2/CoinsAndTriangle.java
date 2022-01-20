package com.rajul;
import java.util.*;

public class CoinsAndTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int coins = sc.nextInt();
            int maxRows = makeTriangle(coins);
            System.out.println(maxRows);
        }

    }
    static int makeTriangle(int coins){
        int count = 0;
        int i = 1;
        while(coins - i >= 0){
            coins = coins - i;
            count++;
            i++;
        }
        return count;
    }
}
