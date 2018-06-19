package codeforces485;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();

        if (Math.pow(a,(double)((b*1.0)/a)) <(b)) {
            out.print("<");
        }
        else if ((a) > Math.pow(b,(double)((a*1.0)/b))) {
            out.print(">");
        }
        else out.print("=");

    }
}
