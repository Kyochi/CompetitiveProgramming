package codeforces492;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int[] q = new int[n];
        int res = 0;
        for (int i = 0 ; i != n; i++) {
            q[i] = in.nextInt();
            q[i] = q[i]%q.length+1;
            if (q[i] == 0) {
                res = (i)%q.length+1;
                break;
            }
        }
        out.print(res);
    }
}
