package codeforces489;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long l = in.nextLong();
        long r = in.nextLong();
        long x = in.nextLong();
        long y = in.nextLong();
        long res = 0;
        while (l < r) {
            if ((l * (r / x)) == y) {
                System.out.println(l + ":" + r);
                res+=2;
                long t = l;
                l = r;
                r = t;
            }

            l++;
            r--;
        }
        out.print(res);
    }
}
