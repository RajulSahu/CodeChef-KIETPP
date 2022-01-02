package com.rajul;
import java.util.*;

public class NobelPrice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(sc.nextInt());
            }
            System.out.println((set.size() == M)?"No":"Yes");
            testCases--;
        }
    }
}
