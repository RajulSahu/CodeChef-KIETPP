package com.rajul;
import java.util.*;

public class FindDirection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            int N = sc.nextInt();
            System.out.println(findDirection(N));
            testCases--;
        }
    }
    static String findDirection(int n) {
        String dir = "North";
        if(n % 4 == 0) dir = "North";
        else if(n % 4 == 1) dir = "East";
        else if(n % 4 == 2) dir = "South";
        else if(n % 4 == 3) dir = "West";
        return dir;
    }
}
