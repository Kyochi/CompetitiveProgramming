package codeforces444;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0 ; i != n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0 ; j != 6; j++) l.add(in.nextInt());

            li.add(l);
        }

        int[] maxT = new int[1000];
        backtrack(li,0, maxT, "");

        boolean canbe = false;
        for (int i = 0 ; i != maxT.length ; i++) {
            if (i != 0 && maxT[i] == 0){
                canbe = true;
                out.print(i-1);
                break;
            }
        }
        if (!canbe) out.print(0);
    }
    public void backtrack (List<List<Integer>> list, int pos, int[] maxT, String sum) {
        if (pos ==3) return;
        if (sum.length() != 0) maxT[Integer.valueOf(sum)] = 1;

        for (int i = 0; i <= list.get(pos).size() ; i++) {
            if (i == list.get(pos).size()){
                backtrack(list, pos+1, maxT, sum +"");
                continue;
            }
            if (pos==0 && list.get(pos).get(i) == '0')continue;

            backtrack(list, pos+1, maxT, new String(sum +""+ list.get(pos).get(i)));
        }
    }
}
