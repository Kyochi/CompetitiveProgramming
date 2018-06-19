import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Baptiste
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskCC solver = new TaskCC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskCC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Long> disp = new ArrayList<>();
            List<Long> price = new ArrayList<>();
            int m = n;
            int len = n;
            while (m != 0) {
                disp.add(in.nextLong());
                m--;
            }
            while (n != 0) {
                price.add(in.nextLong());
                n--;
            }
            long last = len - 1;
            long minL = Long.MAX_VALUE;
            long minR = Long.MAX_VALUE;
            for (int i = 0; i != len; i++) {
                for (int j = 0; j < i; j++) {
                    if (disp.get(i) > disp.get(j) && price.get(i) + price.get(j) < minL && i != len - 1) {
                        minL = price.get(i) + price.get(j);
                        last = i;
                    }
                }
            }
            for (int k = len - 1; k > last; k--) {
                if (disp.get(k) > disp.get((int) last))
                    minR = Math.min(minR, price.get(k));
            }
            if (minL == Long.MAX_VALUE || minR == Long.MAX_VALUE) out.print(-1);
            else out.print(minL + minR);
        }

    }
}

