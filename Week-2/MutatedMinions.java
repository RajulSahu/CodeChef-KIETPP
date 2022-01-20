package com.rajul;
import java.util.*;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] characteristics = new int[N];
            for (int j = 0; j < N; j++) {
                characteristics[j] = sc.nextInt();
            }
            int ans = isWolverine(characteristics, K);
            System.out.println(ans);
        }
    }
    static int isWolverine(int[] ch, int K){
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            ch[i] += K;
            if(ch[i]%7==0) count++;
        }
        return count;
    }
}
