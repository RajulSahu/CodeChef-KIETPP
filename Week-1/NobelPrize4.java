package com.rajul;
import java.io.*;
import java.util.*;


public class NobelPrize4 {
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastScanner  sc = new FastScanner();
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
