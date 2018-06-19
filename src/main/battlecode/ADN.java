package main.battlecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ADN {
    public static int sum = 0;
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

        backtrack(0, 15);
        System.out.println(sum);
    }
    public static void backtrack(int n , int max) {
        if (n == max) {
            sum++;
            return;
        }
        for (int i = n+1 ; i+n <= max; i++) {
            backtrack(i+n+1, max);
        }
    }
}
