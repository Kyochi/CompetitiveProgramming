package codeforces492;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long bills = 0;
        if (n >= 100) {
            long b = (n/100);
            bills+=b;
            n -= (100*b);
        }
        if (n >= 20) {
            long b = (n/20);
            bills+=b;
            n = n - (20*b);
        }
        if (n >= 10) {
            long b = (n/10);
            bills+=b;
            n = n - (10*b);
        }
        if (n >= 5) {
            long b = (n/5);
            bills+=b;
            n = n - (5*b);
        }
        if (n >= 1) {
            bills+=n;
            n = n - n;
        }
        out.print(bills);
    }
}
