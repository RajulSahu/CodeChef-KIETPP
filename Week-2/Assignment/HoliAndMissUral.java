package com.rajul.Assignment;
import java.util.*;

public class HoliAndMissUral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            sc.nextLine();
            String[] Dist = sc.nextLine().split(" ");
            String[] Price = sc.nextLine().split(" ");
            System.out.println(Arrays.toString(Dist));
            System.out.println(Arrays.toString(Price));
            long ans = buyColor(N, K, Dist, Price);
            System.out.println(ans);
        }
    }
    static long buyColor(int N, int K, String[] dist, String[] price){
        long minCost = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long currCost =  Long.parseLong(dist[i])*K + Long.parseLong(price[i]);
            if(currCost < minCost){
                minCost = currCost;
            }
        }
        return minCost;
    }
}
