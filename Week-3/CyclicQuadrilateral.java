package com.rajul;
import java.util.*;

public class CyclicQuadrilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(isCyclicQuadrilateral(A,B,C,D)?"YES":"NO");
            testCases--;
        }
    }
    static boolean isCyclicQuadrilateral(int a, int b, int c, int d) {
        return (a + c == 180 && b + d == 180);
    }
}
