package educational44;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] chB = new int[n+1];
        int odd = 0;
        int even = 0;
        int dec = 1;
        int move = 0;
        for (int i = 0 ; i != n/2 ; i++) {
            int pl = in.nextInt();
            chB[pl] = 1;
            if (pl % 2 == 0) even++;
            else odd++;

            if (pl != 1 && chB[pl-1] == 1) dec++;
        }
        move = Math.min(odd, even)*dec;
        out.print(move);
    }
}
