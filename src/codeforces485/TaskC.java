package codeforces485;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    static long minG = Long.MAX_VALUE;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        List<Long> disp = new ArrayList<>();
        List<Long> price = new ArrayList<>();
        int nn = n;
        int m = n;
        while (m != 0) {
            disp.add(in.nextLong());
            m--;
        }
        while (n != 0) {
            price.add(in.nextLong());
            n--;
        }
        for (int i = 0 ; i != nn ; i++) {
            int ind = -1;
            long miniL = Long.MAX_VALUE;
            for (int j = 0 ; j < i; j++) {
                if (disp.get(j) < disp.get(i)) {
                    if (miniL > price.get(i) + price.get(j)) {
                        miniL = price.get(i) + price.get(j);
                        ind = 1;
                    }
                }
            }
            if (ind != -1) {
                long miniR = Long.MAX_VALUE;
                for (int k = nn - 1; k > i; k--) {
                    if (disp.get(k) > disp.get(i)) {
                        miniR = Math.min(miniR, price.get(k));
                        minG = Math.min(minG, miniR + miniL);
                    }
                }
            }
        }
        out.print((minG != Long.MAX_VALUE) ? minG : -1);
    }
}
