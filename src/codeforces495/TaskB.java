package codeforces495;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        StringBuilder s = new StringBuilder("0");
        for (int i = 1 ; i != n ; i++) {
            if (i%2 == 0) s.append("0");
            else s.append("1");
        }
        out.print(s.toString());
    }
}
