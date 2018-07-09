package codeforces495;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long d = in.nextLong();
        int res = 2;
        List<Long> tab = new ArrayList<>();
        while (in.hasNext()) tab.add(in.nextLong());

        for (int i = 0 ; i != n-1 ; i++) {
            if ((tab.get(i+1) - tab.get(i)) > 2*d) res+=2;
            else if ((tab.get(i+1) - tab.get(i)) == 2*d) res++;
        }
        out.print(res);
    }
}
