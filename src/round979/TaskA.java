package round979;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        if (n==0) out.print(0);
        else if ((n+1)%2 == 0) out.print((n+1)/2);
        else out.print(n+1);
    }
}
