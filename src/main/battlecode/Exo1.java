package main.battlecode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Exo1 {

    public static int minFlip = 7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> crepes = new ArrayList<>();
        for (int i = 1 ; i <= 6 ; i++) {
            crepes.add(sc.nextInt());
        }

        backtrack(crepes, 0);
        System.out.println(minFlip);
    }
    public static void backtrack(List<Integer> crepes, int flip) {
        if (checkReverseSort(crepes)) {
            minFlip = Math.min(minFlip, flip);
            return;
        }

        if (flip == 7){
            return;
        }

        for (int i = 1; i != crepes.size() ; i++) {
                backtrack(reverseRange(crepes, i), flip+1);
            }

    }


    public static List<Integer> reverseRange(List<Integer> li, int start) {
        List<Integer> nli = new ArrayList<>(li);
        int end = 0;
        while (end <= start) {
            Collections.swap(nli, start--, end++);
        }
        return nli;
    }
    public static boolean checkReverseSort(List<Integer> li) {
        for (int i = 1 ; i  != li.size(); i++) {
            if (li.get(i-1) > li.get(i)) {
                return false;
            }
        }
        return true;
    }
}
